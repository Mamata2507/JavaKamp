package kodlamaio.Hrms.core.adapters;

import kodlamaio.Hrms.fakeMernisValidationService.FakeMernisManager;

public class MernisAdapter implements MernisService{

	private FakeMernisManager fakeMernisManager;
	
	@Override
	public boolean identityNumberValidation(String identityNumber) {
		
		return this.fakeMernisManager.identityNumberValidation(identityNumber);
	}

}
