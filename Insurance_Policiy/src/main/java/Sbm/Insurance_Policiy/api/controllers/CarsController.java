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

import Sbm.Insurance_Policiy.business.abstracts.CarService;
import Sbm.Insurance_Policiy.business.abstracts.InsurancePolicyService;
import Sbm.Insurance_Policiy.core.utilities.results.DataResult;
import Sbm.Insurance_Policiy.core.utilities.results.Result;
import Sbm.Insurance_Policiy.core.utilities.results.SuccessResult;
import Sbm.Insurance_Policiy.entities.concretes.InsurancePolicy;
import Sbm.Insurance_Policiy.entities.concretes.Car;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    private CarService carService;
	
	@Autowired
	public CarsController(CarService carService) {
		super();
		this.carService = carService;
	}

	@GetMapping("/getById")
	public DataResult<Car> getById(int id)
	{
	   return this.carService.getById(id);	
	}
	
	@GetMapping("/getall")
	public DataResult<List<Car>> getAll()
	{	
		return this.carService.getAll(); 
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Car car){
		return this.carService.add(car);
	}
	
	@PutMapping("/update")
	public Result update(@RequestBody Car car)
	{
		return this.carService.update(car);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestBody Car car)
	{
		return this.carService.delete(car);
	}
	
	
}
