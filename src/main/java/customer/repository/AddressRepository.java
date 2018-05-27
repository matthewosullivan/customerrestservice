package customer.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import customer.entity.Address;

@RepositoryRestResource
public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {

}
