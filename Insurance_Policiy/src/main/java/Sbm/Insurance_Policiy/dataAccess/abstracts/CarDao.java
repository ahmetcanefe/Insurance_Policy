package Sbm.Insurance_Policiy.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Sbm.Insurance_Policiy.entities.concretes.Car;

public interface CarDao extends JpaRepository<Car,Integer>{
	
	
}
