package interfaceAbstractDemo;


import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		
		 Customer customer = new Customer();
		 customer.setId(1);
		 customer.setFirstName("Engin");
		 customer.setLastName("Demirog");
		 customer.setDateofBirth (new GregorianCalendar(1993, 11 , 16).getTime());
		 customer.setNationalityId("288614");
	        
		
	
		
          BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServisAdapter());
			customerManager.Save(customer);
	


  }
}
