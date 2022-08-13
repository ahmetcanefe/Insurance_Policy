package Sbm.Insurance_Policiy.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="customers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cars"})
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="customer_ame")
	private String customerName;
	
	@Column(name="customer_phone")
	private String customerPhone;
	
	@OneToMany(mappedBy = "customer")
	private List<Car> cars;

	public Customer() {
		
	}
	
	public Customer(int customerId, String customerName, String customerPhone, List<Car> cars) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.cars = cars;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
}
