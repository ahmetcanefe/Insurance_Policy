package Sbm.Insurance_Policiy.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Sbm.Insurance_Policiy.business.abstracts.InsurancePolicyService;
import Sbm.Insurance_Policiy.core.utilities.results.DataResult;
import Sbm.Insurance_Policiy.core.utilities.results.Result;
import Sbm.Insurance_Policiy.core.utilities.results.SuccessDataResult;
import Sbm.Insurance_Policiy.core.utilities.results.SuccessResult;
import Sbm.Insurance_Policiy.dataAccess.abstracts.InsurancePolicyDao;
import Sbm.Insurance_Policiy.entities.concretes.InsurancePolicy;

@Service
public class InsurancePolicyManager implements InsurancePolicyService
{

	private InsurancePolicyDao insurancePolicyDao;
	
	@Autowired
	public InsurancePolicyManager(InsurancePolicyDao insurancePolicyDao) 
	{
		super();
		this.insurancePolicyDao = insurancePolicyDao;
	}

	@Override
	public Result add(InsurancePolicy insurancePolicy) {
		this.insurancePolicyDao.save(insurancePolicy);
		return new SuccessResult("başarılı");
	}

	@Override
	public Result update(InsurancePolicy insurancePolicy) {
		InsurancePolicy existingInsurancePolicy = this.insurancePolicyDao.getById(insurancePolicy.getInsurancePolicyId());
		existingInsurancePolicy.setInsurancePolicyName(insurancePolicy.getInsurancePolicyName());
		existingInsurancePolicy.setInsurancePolicyPaymentDay(insurancePolicy.getInsurancePolicyPaymentDay());
		existingInsurancePolicy.setInsurancePolicyStartDate(insurancePolicy.getInsurancePolicyStartDate());
		existingInsurancePolicy.setInsurancePolicyEndDate(insurancePolicy.getInsurancePolicyEndDate());
		existingInsurancePolicy.setCars(insurancePolicy.getCars());
		this.insurancePolicyDao.save(existingInsurancePolicy);
		
		return new SuccessResult("başarılı");
	}

	@Override
	public Result delete(InsurancePolicy insurancePolicy) {
		this.insurancePolicyDao.delete(insurancePolicy);
		return new SuccessResult("Başarılı");
	}

	@Override
	public DataResult<InsurancePolicy> getById(int id) {
		return new SuccessDataResult<InsurancePolicy>(this.insurancePolicyDao.findById(id).orElse(null),"başarılı");
	}

	@Override
	public DataResult<List<InsurancePolicy>> getAll() {
		return new SuccessDataResult<List<InsurancePolicy>>(this.insurancePolicyDao.findAll(),"başarılı");
	}
	
	
	
}
