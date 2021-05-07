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
			
		System.out.println("> Kayýt baþarýlý : " + customer.geteMail());
		
		}
		else {
		
		System.out.println("> Kayýt Ýþlemi Yapýlamadý! ");
		
		}
		}
	 
@Override
	public void emailValidation(Customer customer) {
		// TODO Auto-generated method stub
	if(!EmailValidationManager.emailFormatController(customer.geteMail())) {
	    
		System.out.println("> " + customer.geteMail() + " adresine eposta doðrulamasý gönderilmiþtir. Lütfen epostanýzý doðrulama için ..... linkine týklayýnýz.");
	
	}
	else {
		
		System.out.println("> " + customer.geteMail() + " adresine eposta doðrulamasý gönderilememiþtir. Lütfen bilgilerinizi gözden geçiriniz! ");
	}
	}

@Override
	public void emailValidationCheck(Customer customer) {
		// TODO Auto-generated method stub
	 //E-posta doðrulama kontrolü
	if(!EmailValidationManager.emailValidation(customer.geteMail())) {
		
       System.out.println("> E-posta baþarýyla doðrulandý: " + customer.geteMail());
       
	} else {
	
    	System.out.println("> Tekrar doðrulama gönderiniz.");
    	
       }
	}


	@Override
	public void login(Customer customer) {
		// TODO Auto-generated method stub
		if(!(customer.geteMail() == "") && !(customer.getPassword() == "")) {
		
	    	 System.out.println("> Giriþ Yapma Ýþlemi Baþarýlý! : > Hoþgeldiniz Sayýn " + customer.getFirstName() + " " + customer.getLastName());
	    	 
	     }else {
	    	
	    	 System.out.println("> Giriþ Ýþlemi Yapýlamadý!. Lütfen bilgilerinizi gözden geçiriniz! ");
	    	 
	     }
	}
	
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return this.customers;
	}

	

	

	



}
