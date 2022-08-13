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

import Sbm.Insurance_Policiy.business.abstracts.InsurancePolicyService;
import Sbm.Insurance_Policiy.core.utilities.results.DataResult;
import Sbm.Insurance_Policiy.core.utilities.results.Result;
import Sbm.Insurance_Policiy.entities.concretes.InsurancePolicy;

@RestController
@RequestMapping("/api/policies")
public class PoliciesController {

    private InsurancePolicyService insurancePolicyService;
	
	@Autowired
	public PoliciesController(InsurancePolicyService insurancePolicyService) {
		super();
		this.insurancePolicyService = insurancePolicyService;
	}

	@GetMapping("/getAll")
	public DataResult<List<InsurancePolicy>> getAll()
	{	
		return this.insurancePolicyService.getAll(); 
	}
	
	@GetMapping("/getById")
	public DataResult<InsurancePolicy> getById(int id)
	{
		return this.insurancePolicyService.getById(id);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody InsurancePolicy insurancePolicy)
	{
		return this.insurancePolicyService.add(insurancePolicy);
	}
	
	@PutMapping("/update")
	public Result update(@RequestBody InsurancePolicy insurancePolicy)
	{
		return this.insurancePolicyService.update(insurancePolicy);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestBody InsurancePolicy insurancePolicy)
	{
		return this.insurancePolicyService.delete(insurancePolicy);
	}
}
