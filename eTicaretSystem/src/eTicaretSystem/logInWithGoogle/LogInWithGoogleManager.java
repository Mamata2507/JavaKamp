package eTicaretSystem.logInWithGoogle;

import eTicaretSystem.entities.concrete.Customer;

public class LogInWithGoogleManager {
     public void login(Customer customer) {
    	
    	 if(!(customer.geteMail() == "") && !(customer.getPassword() == "")) {
    		 System.out.println();
    		 System.out.println("> Google Hesab� ile Sisteme Giri� Yap�ld�! : " + customer.geteMail());
    		 System.out.println();
     }else {
    	 System.out.println();
    	 System.out.println("> Google Hesab� ile Giri� ��lemi Yap�lamad�!. L�tfen bilgilerinizi g�zden ge�iriniz! ");
    	 System.out.println();
    	 }
     }
    public void register(Customer customer) {
    	if(customer.geteMail() != "" && customer.getPassword() != "") {
    		System.out.println();
    		System.out.println("> Google Hesab� ile Kay�t ba�ar�l� : " + customer.geteMail());
    		System.out.println();
    		}
    		else {
    		System.out.println();
    		System.out.println("> Google Hesab� ile Kay�t ��lemi Yap�lamad�! ");
    		System.out.println();
    		}
    		
    
}
}