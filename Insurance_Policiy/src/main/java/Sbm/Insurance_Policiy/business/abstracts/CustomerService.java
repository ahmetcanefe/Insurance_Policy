package Sbm.Insurance_Policiy.business.abstracts;

import java.util.List;

import Sbm.Insurance_Policiy.core.utilities.results.DataResult;
import Sbm.Insurance_Policiy.core.utilities.results.Result;
import Sbm.Insurance_Policiy.entities.concretes.Customer;

public interface CustomerService {

	Result add(Customer customer);
	Result update(Customer customer);
	Result delete(Customer customer);
	
	DataResult<Customer> getById(int id);
	DataResult<List<Customer>> getAll();
}
