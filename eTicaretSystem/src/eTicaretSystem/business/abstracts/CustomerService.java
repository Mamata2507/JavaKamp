package eTicaretSystem.business.abstracts;

import eTicaretSystem.entities.concrete.Customer;

public interface CustomerService {
    void register(Customer[] customers);
    void login (Customer[] customers);
    void loginWithGoogle (Customer[] customers);
    void registerWithGoogle(Customer[] customers);
    void emailValidation(Customer[] customers);
	void emailValidationcheck(Customer[] customers);
}
