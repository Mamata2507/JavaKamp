package kodlamaio.Hrms.fakeEmailValidationService;


import java.util.regex.Pattern;

public class FakeEmailManager {

	

public   boolean emailFormatController (String email) {
	
    final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";
    
    if (!Pattern.matches(EMAIL_PATTERN, email )) {
    	
        return true;
    } else {
    	
        return false;
    }
    
   
} 

}
