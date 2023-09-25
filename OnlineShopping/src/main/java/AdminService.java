import java.util.List;

import org.springframework.stereotype.Service;

import CustomerService.CustomerRepository;
import CustomerService.ProductRepository;

@Service
public class AdminService {
    private final CustomerService.ProductRepository productRepository = null;
    private final CustomerService.CustomerRepository customerRepository = null;

    

	public void addProduct(Product product) {
		
		
	}



	public List<Product> getAllProducts() {
		
		return null;
	}

}

@Service
public class CustomerService {
    private final ProductRepository productRepository;
    private final CustomerRepository customerRepository;

  
}