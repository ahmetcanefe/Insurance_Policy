package Sbm.Insurance_Policiy.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Sbm.Insurance_Policiy.entities.concretes.InsurancePolicy;

public interface InsurancePolicyDao extends JpaRepository<InsurancePolicy,Integer>{

}
