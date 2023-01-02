package yufucn.lowcode.ddd.application.services;

import lombok.Getter;
import lombok.Setter;
import lombok.var;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import yufucn.lowcode.ddd.application.contracts.dtos.PagedAndSortedResultRequestDto;
import yufucn.lowcode.ddd.application.contracts.dtos.PagedResultDto;
import yufucn.lowcode.ddd.application.contracts.dtos.PagedResultRequestDto;
import yufucn.lowcode.ddd.application.contracts.services.ICrudAppService;
import yufucn.lowcode.ddd.domain.entities.AbstractBaseEntityKey;
import yufucn.lowcode.ddd.domain.repositories.IRepository;

import javax.persistence.EntityNotFoundException;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author wang
 * @date 2022/12/31 22:33
 */
@MappedSuperclass
@Getter
@Setter
public abstract class CrudAppService<
        TKey extends Serializable,
        TEntity extends AbstractBaseEntityKey<TKey>,
        TGetOutputDto,
        TGetListOutputDto,
        TGetListInput,
        TCreateInput,
        TUpdateInput>
        implements ICrudAppService<TKey, TGetOutputDto, TGetListOutputDto, TGetListInput, TCreateInput, TUpdateInput> {

    private IRepository<TEntity, TKey> repository;

    public CrudAppService(IRepository<TEntity, TKey> repository) {
        this.repository = repository;
    }

    @Override
    public TGetOutputDto get(TKey id) {
        return repository.findById(id)
                .map(this::mapToGetOutputDto)
                .orElseThrow(() -> new EntityNotFoundException("Entity " + id + " not found"));
    }

    @Override
    public void delete(TKey id) {
        repository.deleteById(id);
    }

    @Override
    public TGetOutputDto create(TCreateInput tCreateInput) {
        var entity = mapToEntity(tCreateInput);
        repository.save(entity);
        return mapToGetOutputDto(entity);
    }

    @Override
    public TGetOutputDto update(TKey id, TUpdateInput tUpdateInput) {
        var entity = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity " + id + " not found"));
        mapToEntity(tUpdateInput, entity);
        repository.save(entity);
        return mapToGetOutputDto(entity);
    }

    @Override
    public Page<TGetListOutputDto> getList(TGetListInput tGetListInput) {
        var query = createFilteredQuery(tGetListInput);
        Pageable pageable = applyPaging(tGetListInput);
        return repository.findAll(query, pageable).map(this::mapToGetListOutputDto);
    }

    protected Pageable applyPaging(TGetListInput tGetListInput) {
        Integer page = 0;
        Integer size = 10;
        Sort sort = null;
        if (tGetListInput instanceof PagedResultRequestDto) {
            var dto = (PagedResultRequestDto) tGetListInput;
            page = dto.getPageIndex();
            size = dto.getPageSize();
        }
        if (tGetListInput instanceof PagedAndSortedResultRequestDto) {
            var dto = (PagedAndSortedResultRequestDto) tGetListInput;
            sort = dto.buildSort();
        }
        if (sort == null) {
            sort = Sort.by(Sort.Direction.DESC, "id");
        }
        return PageRequest.of(page, size, sort);
    }

    public abstract TEntity mapToEntity(TCreateInput createInput);

    public abstract void mapToEntity(TUpdateInput updateInput, TEntity entity);

    public abstract TGetOutputDto mapToGetOutputDto(TEntity entity);

    public abstract TGetListOutputDto mapToGetListOutputDto(TEntity entity);

    public abstract Specification<TEntity> createFilteredQuery(TGetListInput tGetListInput);
}
