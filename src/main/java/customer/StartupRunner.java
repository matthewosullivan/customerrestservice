package customer;

import java.time.LocalDate;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import customer.entity.Address;
import customer.entity.AddressType;
import customer.entity.Customer;
import customer.repository.AddressRepository;
import customer.repository.CustomerRepository;


public class StartupRunner implements CommandLineRunner {

	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired 
	private CustomerRepository customerRepository;
	
	@Autowired 
	private AddressRepository addressRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		Customer customer = new Customer("Bob", "Perry", LocalDate.of(1980, 12, 20));
		
		customerRepository.save(customer);
		
		logger.info("Number of Customers: " + customerRepository.count()); 
		
		Address address = new Address("1","2","3","4","1@1.com","0449263071", AddressType.HOME, customer);
		
		addressRepository.save(address);
	}

}
