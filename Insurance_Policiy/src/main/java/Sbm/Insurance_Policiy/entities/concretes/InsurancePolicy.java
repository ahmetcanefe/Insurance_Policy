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
@Table(name="insurancePolicies")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cars"})
public class InsurancePolicy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="insurance_policy_id")
	private int insurancePolicyId;
	
	@Column(name="insurance_policy_name")
	private String insurancePolicyName;
	
	@Column(name="insurance_policy_payment_day")
	private String insurancePolicyPaymentDay;
	
	@Column(name="insurance_policy_start_date")
	private String insurancePolicyStartDate;
	
	@Column(name="insurance_policy_end_date")
	private String insurancePolicyEndDate;
	
	@OneToMany(mappedBy = "insurancePolicy")
	private List<Car> cars;

	public InsurancePolicy() {
		
	}

	public InsurancePolicy(int insurancePolicyId, String insurancePolicyName, String insurancePolicyPaymentDay,
			String insurancePolicyStartDate, String insurancePolicyEndDate, List<Car> cars) {
		super();
		this.insurancePolicyId = insurancePolicyId;
		this.insurancePolicyName = insurancePolicyName;
		this.insurancePolicyPaymentDay = insurancePolicyPaymentDay;
		this.insurancePolicyStartDate = insurancePolicyStartDate;
		this.insurancePolicyEndDate = insurancePolicyEndDate;
		this.cars = cars;
	}

	public int getInsurancePolicyId() {
		return insurancePolicyId;
	}

	public void setInsurancePolicyId(int insurancePolicyId) {
		this.insurancePolicyId = insurancePolicyId;
	}

	public String getInsurancePolicyName() {
		return insurancePolicyName;
	}

	public void setInsurancePolicyName(String insurancePolicyName) {
		this.insurancePolicyName = insurancePolicyName;
	}

	public String getInsurancePolicyPaymentDay() {
		return insurancePolicyPaymentDay;
	}

	public void setInsurancePolicyPaymentDay(String insurancePolicyPaymentDay) {
		this.insurancePolicyPaymentDay = insurancePolicyPaymentDay;
	}

	public String getInsurancePolicyStartDate() {
		return insurancePolicyStartDate;
	}

	public void setInsurancePolicyStartDate(String insurancePolicyStartDate) {
		this.insurancePolicyStartDate = insurancePolicyStartDate;
	}

	public String getInsurancePolicyEndDate() {
		return insurancePolicyEndDate;
	}

	public void setInsurancePolicyEndDate(String insurancePolicyEndDate) {
		this.insurancePolicyEndDate = insurancePolicyEndDate;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	
	

	
}
