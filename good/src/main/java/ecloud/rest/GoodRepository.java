package ecloud.rest;

import ecloud.entity.Good;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "good", path = "/good")
public interface GoodRepository extends PagingAndSortingRepository<Good, Long> {
}
