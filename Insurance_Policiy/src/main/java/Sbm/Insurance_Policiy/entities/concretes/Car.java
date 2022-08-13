package Sbm.Insurance_Policiy.entities.concretes;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@Entity
@Table(name="cars")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","carDetails"})
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="car_id")
	private int carId;
	
	@Column(name="car_model")
	private String carModel;
	
	@Column(name="license_Plate")
	private String licensePlate;
	
	@Column(name="car_color")
	private String carColor;
	
	@Column(name="car_owner")
	private String carOwner;
	
	@ManyToOne()
	@JoinColumn(name="insurance_policy_id")
	private InsurancePolicy insurancePolicy;
	
	@ManyToOne()
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@OneToMany(mappedBy = "car")
	private List<CarDetail> carDetails;

	public Car() {
		
	}

	public Car(int carId, String carModel, String lisencePlate, String carColor, String carOwner,
			InsurancePolicy insurancePolicy, List<CarDetail> carDetails) {
		super();
		this.carId = carId;
		this.carModel = carModel;
		this.licensePlate = lisencePlate;
		this.carColor = carColor;
		this.carOwner = carOwner;
		this.insurancePolicy = insurancePolicy;
		this.carDetails = carDetails;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getlicensePlate() {
		return licensePlate;
	}

	public void setlicensePlate(String carEngineNumber) {
		this.licensePlate = carEngineNumber;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}

	public InsurancePolicy getInsurancePolicy() {
		return insurancePolicy;
	}

	public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
		this.insurancePolicy = insurancePolicy;
	}

	public List<CarDetail> getCarDetails() {
		return carDetails;
	}

	public void setCarDetails(List<CarDetail> carDetails) {
		this.carDetails = carDetails;
	}
	
	
	
	
	
}
