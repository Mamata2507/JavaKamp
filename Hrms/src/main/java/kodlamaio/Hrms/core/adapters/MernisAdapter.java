package kodlamaio.Hrms.core.adapters;

import java.util.Date;



public class MernisAdapter implements MernisService{

	@Override
	public boolean userİnformationValidation(String firstName, String lastName, String identityNumber, Date birthDate) {
		
		if(firstName.length()> 6 && lastName.length()> 6 && identityNumber.length() == 11 && birthDate.getTime() > 1974) {
			
			System.out.println("Kullanıcı bilgileri doğrulaması başarılı!");
			return true;
		}else {
			
			System.out.println("Kullanıcı bilgileri doğrulaması başarısız! Lütfen bilgilerinizi gözden geçiriniz.");
			return false;
		}
		
		
	}

}
