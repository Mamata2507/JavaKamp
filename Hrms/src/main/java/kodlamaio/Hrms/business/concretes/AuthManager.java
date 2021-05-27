package kodlamaio.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.AuthService;
import kodlamaio.Hrms.core.adapters.EmailService;
import kodlamaio.Hrms.core.adapters.MernisService;
import kodlamaio.Hrms.dataAccess.abstracts.UsersDao;

@Service
public class AuthManager implements AuthService{

	private UsersDao usersDao;
	private EmailService emailService;
	private MernisService mernisService;
	
	private String message;
	
	@Autowired
	public AuthManager(UsersDao usersDao, EmailService emailService, MernisService mernisService) {
		
		this.usersDao = usersDao;
		this.emailService = emailService;
		this.mernisService = mernisService;
	}

	@Override
	public boolean checkEmail(String email) {
		
		if(!this.emailService.emailFormatController(email)) {
			this.message = "Lütfen gerçek bir email formatında email giriniz! ";
			return false;
		}
		
		if(!this.usersDao.findByEmail(email).isEmpty()) {
			this.message = "Girdiğiniz mail sistemde mevcut! ";
			return false;
		}
		
		return true;
	}

	@Override
	public boolean checkIdentityNumber(String identityNumber) {
		if(!this.mernisService.identityNumberValidation(identityNumber)){
			
			this.message = "Tc Kimlik Numarası 11 hane olmak zorundadır! ";
			return false;
		}
		
		return true;
	}

	@Override
	public boolean checkCenter(String email, String identityNumber) {
		
		return (this.emailService.emailFormatController(email) && this.mernisService.identityNumberValidation(identityNumber));
	}

	public String getMessage() {
		
		return this.message;
	}
}
