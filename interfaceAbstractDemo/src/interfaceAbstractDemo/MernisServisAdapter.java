package interfaceAbstractDemo;

public class MernisServisAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
		
		
	}

}
