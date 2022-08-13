package Sbm.Insurance_Policiy.business.abstracts;

import java.util.List;

import Sbm.Insurance_Policiy.core.utilities.results.DataResult;
import Sbm.Insurance_Policiy.core.utilities.results.Result;
import Sbm.Insurance_Policiy.entities.concretes.InsurancePolicy;

public interface InsurancePolicyService {

	Result add(InsurancePolicy insurancePolicy);
	Result update(InsurancePolicy insurancePolicy);
	Result delete(InsurancePolicy insurancePolicy);
	
	DataResult<InsurancePolicy> getById(int id);
	DataResult<List<InsurancePolicy>> getAll();
}
