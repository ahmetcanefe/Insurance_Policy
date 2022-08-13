package Sbm.Insurance_Policiy.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Sbm.Insurance_Policiy.business.abstracts.CarService;
import Sbm.Insurance_Policiy.core.utilities.results.DataResult;
import Sbm.Insurance_Policiy.core.utilities.results.Result;
import Sbm.Insurance_Policiy.core.utilities.results.SuccessDataResult;
import Sbm.Insurance_Policiy.core.utilities.results.SuccessResult;
import Sbm.Insurance_Policiy.dataAccess.abstracts.CarDao;
import Sbm.Insurance_Policiy.entities.concretes.Car;



@Service
public class CarManager implements CarService{

    private CarDao carDao;
	
	@Autowired
	public CarManager(CarDao carDao) 
	{
		super();
		this.carDao = carDao;
	}
	
	@Override
	public Result add(Car car) 
	{
		this.carDao.save(car);
		return new SuccessResult("başarılı");
	}

	@Override
	public Result update(Car car) {
		Car existingCar = this.carDao.findById(car.getCarId()).orElse(null);
		
		existingCar.setCarColor(car.getCarColor());
		existingCar.setCarDetails(car.getCarDetails());
		existingCar.setlicensePlate(car.getlicensePlate());
		existingCar.setCarModel(car.getCarModel());
		existingCar.setCarOwner(car.getCarOwner());
		existingCar.setInsurancePolicy(car.getInsurancePolicy());
		
		this.carDao.save(existingCar);
		return new SuccessResult("başarılı");
	}

	@Override
	public Result delete(Car car) {
		this.carDao.delete(car);
		return new SuccessResult("başarılı");
	}

	@Override
	public DataResult<Car> getById(int id) {
		return new SuccessDataResult<Car>(this.carDao.findById(id).orElse(null),"başarılı"); 
	}
	
	@Override
	public DataResult<List<Car>> getAll() {
		return new SuccessDataResult<List<Car>>(this.carDao.findAll(),"Data listelendi");
	}

}
