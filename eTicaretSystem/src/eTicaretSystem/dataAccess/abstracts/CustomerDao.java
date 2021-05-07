package eTicaretSystem.dataAccess.abstracts;

import java.util.List;

import eTicaretSystem.entities.concrete.Customer;

public interface CustomerDao {
    void register(Customer customer);
    void emailValidation(Customer customer);
    void emailValidationCheck(Customer customer);
     void login(Customer customer);
     List<Customer> getCustomers();
	
}
