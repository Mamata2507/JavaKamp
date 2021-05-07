package eTicaretSystem.business.concrete;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import eTicaretSystem.business.abstracts.EmailValidationService;


public class EmailValidationManager implements EmailValidationService {
	



public static  boolean emailFormatController (String email) {
	
	List<String> emailAdd = new ArrayList<String>();
	
    final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";
    final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    Matcher matcher = pattern.matcher(email);
    if (!matcher.matches() == emailAdd.add(EMAIL_PATTERN)) {
        return true;
    } else {
        return false;
    }
    
   
} 

 public  void  eMail(String email) {
	
		 List<String> emailAdd = new ArrayList<String>(); // email kaydýný tutan liste
		emailAdd.add("muhammed.dibek@gmail.com");
		emailAdd.add("eren.dibek@gmail.com");
		
		
		
    }
 
 public static  boolean emailValidation (String email) {
	 return false;
 }
 }

