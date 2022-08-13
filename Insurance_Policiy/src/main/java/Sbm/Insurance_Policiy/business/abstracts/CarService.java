package Sbm.Insurance_Policiy.business.abstracts;

import java.util.List;

import Sbm.Insurance_Policiy.core.utilities.results.DataResult;
import Sbm.Insurance_Policiy.core.utilities.results.Result;
import Sbm.Insurance_Policiy.entities.concretes.Car;

public interface CarService {

	Result add(Car car);
	Result update(Car car);
	Result delete(Car car);
	
	DataResult<Car> getById(int id);
	DataResult<List<Car>> getAll();
	
}
