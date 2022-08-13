package Sbm.Insurance_Policiy.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="carDetails")
public class CarDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="car_detail_id")
	private int carDetailId;
	
	@Column(name="Name")
	private String name;
	
	@ManyToOne()
	@JoinColumn(name="car_id")
	private Car car;

	public CarDetail() {
		
	}

	public CarDetail(int carDetailId, String name, Car car) {
		super();
		this.carDetailId = carDetailId;
		this.name = name;
		this.car = car;
	}

	public int getCarDetailId() {
		return carDetailId;
	}

	public void setCarDetailId(int carDetailId) {
		this.carDetailId = carDetailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
