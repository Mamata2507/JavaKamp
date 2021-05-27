package kodlamaio.Hrms.core.adapters;

import kodlamaio.Hrms.fakeEmailValidationService.FakeEmailManager;

public class EmailAdapter implements EmailService{

	private FakeEmailManager fakeEmailManager;
	
	@Override
	public boolean emailFormatController(String email) {
		
		return this.fakeEmailManager.emailFormatController(email);
	}

}
