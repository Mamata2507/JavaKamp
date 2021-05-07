package eTicaretSystem.logInWithGoogle;

import eTicaretSystem.entities.concrete.Customer;

public class LogInWithGoogleManager {
     public void login(Customer customer) {
    	
    	 if(!(customer.geteMail() == "") && !(customer.getPassword() == "")) {
    		 System.out.println();
    		 System.out.println("> Google Hesabý ile Sisteme Giriþ Yapýldý! : " + customer.geteMail());
    		 System.out.println();
     }else {
    	 System.out.println();
    	 System.out.println("> Google Hesabý ile Giriþ Ýþlemi Yapýlamadý!. Lütfen bilgilerinizi gözden geçiriniz! ");
    	 System.out.println();
    	 }
     }
    public void register(Customer customer) {
    	if(customer.geteMail() != "" && customer.getPassword() != "") {
    		System.out.println();
    		System.out.println("> Google Hesabý ile Kayýt baþarýlý : " + customer.geteMail());
    		System.out.println();
    		}
    		else {
    		System.out.println();
    		System.out.println("> Google Hesabý ile Kayýt Ýþlemi Yapýlamadý! ");
    		System.out.println();
    		}
    		
    
}
}