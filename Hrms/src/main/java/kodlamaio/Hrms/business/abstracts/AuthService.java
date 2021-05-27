package kodlamaio.Hrms.business.abstracts;

public interface AuthService {
     
	  public boolean checkEmail(String email);
	  public boolean checkIdentityNumber(String identityNumber);
	  public boolean checkCenter(String email,String identityNumber);
}
