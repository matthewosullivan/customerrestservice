package customer.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import customer.entity.Customer;


@RepositoryRestResource
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
	
}
