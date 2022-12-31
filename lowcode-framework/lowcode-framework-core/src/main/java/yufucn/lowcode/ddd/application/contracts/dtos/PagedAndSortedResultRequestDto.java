package yufucn.lowcode.ddd.application.contracts.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;

/**
 * @author wang
 * @date 2022/12/31 21:03
 */
@Setter
@Getter
@Slf4j
public class PagedAndSortedResultRequestDto extends PagedResultRequestDto {
    private String direction;
    private String key;

    public Sort buildSort() {
        switch (direction) {
            case "dsc":
                return Sort.by(key).descending();
            case "asc":
                return Sort.by(key).ascending();
            default:
                log.warn("Invalid direction provided in PageSettings, using descending direction as default value");
                return Sort.by(key).descending();
        }
    }
}
