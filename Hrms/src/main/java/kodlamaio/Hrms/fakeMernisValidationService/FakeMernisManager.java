package kodlamaio.Hrms.fakeMernisValidationService;

public class FakeMernisManager {

	
	public boolean identityNumberValidation(String identityNumber) {
		
		if(identityNumber.length() != 11) {
			
			return true;
		} else {
			 return false;
		}
	}
}
