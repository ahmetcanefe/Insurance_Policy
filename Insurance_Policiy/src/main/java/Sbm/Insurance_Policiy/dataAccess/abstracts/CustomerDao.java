package Sbm.Insurance_Policiy.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Sbm.Insurance_Policiy.entities.concretes.Customer;

public interface CustomerDao extends JpaRepository<Customer,Integer>{

}
