package ecloud.rest;

import ecloud.entity.Group;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "group", path = "/group")
public interface GroupRepository extends PagingAndSortingRepository<Group, Long> {
}
