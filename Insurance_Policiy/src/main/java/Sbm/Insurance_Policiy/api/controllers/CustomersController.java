package Sbm.Insurance_Policiy.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Sbm.Insurance_Policiy.business.abstracts.CustomerService;
import Sbm.Insurance_Policiy.core.utilities.results.DataResult;
import Sbm.Insurance_Policiy.core.utilities.results.Result;
import Sbm.Insurance_Policiy.entities.concretes.Customer;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {

	private CustomerService customerService;

	@Autowired
	public CustomersController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Customer>> getAll()
	{
		return this.customerService.getAll();
	}
	
	@GetMapping("/getById")
	public DataResult<Customer> getById(int id)
	{
		return this.customerService.getById(id);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Customer customer)
	{
		return this.customerService.add(customer);
	}
	
	@PutMapping("/update")
	public Result update(@RequestBody Customer customer)
	{
		return this.customerService.update(customer);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestBody Customer customer)
	{
		return this.customerService.delete(customer);
	}
}
