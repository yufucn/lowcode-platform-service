package yufucn.lowcode.ddd.domain.specification;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * @author wang
 * @date 2023/5/24 21:12
 */
public class SoftDeletedSpecification<T> implements Specification<T> {

    private static final long serialVersionUID = -940322276301888908L;

    @Override
    public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        return criteriaBuilder.equal(root.<Integer>get("deleted"), 0);
    }
}
