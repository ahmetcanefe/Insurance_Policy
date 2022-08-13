package Sbm.Insurance_Policiy.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Sbm.Insurance_Policiy.business.abstracts.CarService;
import Sbm.Insurance_Policiy.business.abstracts.CustomerService;
import Sbm.Insurance_Policiy.core.utilities.results.DataResult;
import Sbm.Insurance_Policiy.core.utilities.results.Result;
import Sbm.Insurance_Policiy.core.utilities.results.SuccessDataResult;
import Sbm.Insurance_Policiy.core.utilities.results.SuccessResult;
import Sbm.Insurance_Policiy.dataAccess.abstracts.CustomerDao;
import Sbm.Insurance_Policiy.entities.concretes.Car;
import Sbm.Insurance_Policiy.entities.concretes.Customer;

@Service
public class CustomerManager implements CustomerService{

	private CustomerDao customerDao;
	
	@Autowired
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public Result add(Customer customer) {
		this.customerDao.save(customer);
		return new SuccessResult("başarılı");
	}

	@Override
	public Result update(Customer customer) {
		Customer existingCustomer = this.customerDao.getById(customer.getCustomerId());
		existingCustomer.setCustomerName(customer.getCustomerName());
		existingCustomer.setCustomerPhone(customer.getCustomerPhone());
		existingCustomer.setCars(customer.getCars());
		this.customerDao.save(existingCustomer);
		
		return new SuccessResult("başarılı");
	}

	@Override
	public Result delete(Customer customer)
	{
		this.customerDao.delete(customer);
		return new SuccessResult("başarılı");
	}

	@Override
	public DataResult<Customer> getById(int id) {
		return new SuccessDataResult<Customer>(this.customerDao.findById(id).orElse(null),"başarılı");
	}

	@Override
	public DataResult<List<Customer>> getAll() {
		return new SuccessDataResult<List<Customer>>(this.customerDao.findAll(),"başarılı");
	}
	
	

}
