package eTicaretSystem.dataAccess.concrete;

import java.util.ArrayList;
import java.util.List;

import eTicaretSystem.business.concrete.EmailValidationManager;
import eTicaretSystem.dataAccess.abstracts.CustomerDao;
import eTicaretSystem.entities.concrete.Customer;

public class HibernateCustomerDao implements CustomerDao{

	private final List<Customer> customers = new ArrayList<Customer>();
			
	@Override
	public void register(Customer customer) {
		if(customer.geteMail() != "" && customer.getPassword() != "") {
			
		System.out.println("> Kay�t ba�ar�l� : " + customer.geteMail());
		
		}
		else {
		
		System.out.println("> Kay�t ��lemi Yap�lamad�! ");
		
		}
		}
	 
@Override
	public void emailValidation(Customer customer) {
		// TODO Auto-generated method stub
	if(!EmailValidationManager.emailFormatController(customer.geteMail())) {
	    
		System.out.println("> " + customer.geteMail() + " adresine eposta do�rulamas� g�nderilmi�tir. L�tfen epostan�z� do�rulama i�in ..... linkine t�klay�n�z.");
	
	}
	else {
		
		System.out.println("> " + customer.geteMail() + " adresine eposta do�rulamas� g�nderilememi�tir. L�tfen bilgilerinizi g�zden ge�iriniz! ");
	}
	}

@Override
	public void emailValidationCheck(Customer customer) {
		// TODO Auto-generated method stub
	 //E-posta do�rulama kontrol�
	if(!EmailValidationManager.emailValidation(customer.geteMail())) {
		
       System.out.println("> E-posta ba�ar�yla do�ruland�: " + customer.geteMail());
       
	} else {
	
    	System.out.println("> Tekrar do�rulama g�nderiniz.");
    	
       }
	}


	@Override
	public void login(Customer customer) {
		// TODO Auto-generated method stub
		if(!(customer.geteMail() == "") && !(customer.getPassword() == "")) {
		
	    	 System.out.println("> Giri� Yapma ��lemi Ba�ar�l�! : > Ho�geldiniz Say�n " + customer.getFirstName() + " " + customer.getLastName());
	    	 
	     }else {
	    	
	    	 System.out.println("> Giri� ��lemi Yap�lamad�!. L�tfen bilgilerinizi g�zden ge�iriniz! ");
	    	 
	     }
	}
	
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return this.customers;
	}

	

	

	



}
