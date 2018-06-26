package ecloud.rest;

import ecloud.entity.Order;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "order", path = "/order")
public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
}
