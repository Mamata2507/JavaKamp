package eTicaretSystem.business.concrete;

import eTicaretSystem.business.abstracts.CustomerService;
import eTicaretSystem.core.LogInWithService;
import eTicaretSystem.dataAccess.abstracts.CustomerDao;
import eTicaretSystem.entities.concrete.Customer;

public class CustomerManager implements CustomerService {

	private CustomerDao customerDao;
	private LogInWithService logInWithService;

	public CustomerManager(CustomerDao customerDao, LogInWithService logInWithService) {
		super();
		this.customerDao = customerDao;
		this.logInWithService = logInWithService;
	}

	@Override
	public void register(Customer[] customers) {

	for (Customer customer : customers) {

			// email kontrolü
	if (!EmailValidationManager.emailFormatController(customer.geteMail())) {

	   System.out.println();
	   System.out.println("> Kayýt yapýlamadý! ");
	   System.out.println();
	   System.out.println("> Bu Email Adresi Zaten Sistemde Kayýtlý: " + customer.geteMail());
	   System.out.println();
	   System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			}
			// kullanýcý bilgileri kontrolü
	else if (customer.getFirstName().length() < 2 || customer.getLastName().length() < 2) {
	   System.out.println();
	   System.out.println("> Ad ve Soyad en az iki karakterden oluþmalýdýr, kayýt yapýlamadý.");
	   System.out.println();
	   System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			}

	else if (customer.getPassword().length() < 6) {
	   System.out.println();
	   System.out.println("> Þifre en az 6 karakterden oluþmalýdýr, kayýt yapýlamadý.");
	   System.out.println();
	   System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	} else {
	   System.out.println();
	   this.customerDao.register(customer);
	   System.out.println();
	   System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			}
		}
	}

	@Override
	public void login(Customer[] customers) {

	for (Customer customer : customers) {
	   System.out.println();
	   this.customerDao.login(customer);
	   System.out.println();
	   System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		}
	}

	@Override
	public void loginWithGoogle(Customer[] customers) {

	for (Customer customer : customers) {
	   System.out.println();
	   this.logInWithService.login(customer);
	   System.out.println();
	   System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		}
	}

	@Override
	public void registerWithGoogle(Customer[] customers) {

	for (Customer customer : customers) {
	   System.out.println();
	   this.logInWithService.register(customer);
	   System.out.println();
	   System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		}
	}

	@Override
	public void emailValidation(Customer[] customers) {

	for (Customer customer : customers) {
	   System.out.println();
	   this.customerDao.emailValidation(customer);
	   System.out.println();
	   System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		}
	}

	@Override
	public void emailValidationcheck(Customer[] customers) {

	for (Customer customer : customers) {
	   System.out.println();
	   this.customerDao.emailValidationCheck(customer);
	   System.out.println();
	   System.out.println("-------------------------------------------------------------------------------------------------------------------------");

		}

	}

}
