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

			// email kontrol�
	if (!EmailValidationManager.emailFormatController(customer.geteMail())) {

	   System.out.println();
	   System.out.println("> Kay�t yap�lamad�! ");
	   System.out.println();
	   System.out.println("> Bu Email Adresi Zaten Sistemde Kay�tl�: " + customer.geteMail());
	   System.out.println();
	   System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			}
			// kullan�c� bilgileri kontrol�
	else if (customer.getFirstName().length() < 2 || customer.getLastName().length() < 2) {
	   System.out.println();
	   System.out.println("> Ad ve Soyad en az iki karakterden olu�mal�d�r, kay�t yap�lamad�.");
	   System.out.println();
	   System.out.println("-------------------------------------------------------------------------------------------------------------------------");
			}

	else if (customer.getPassword().length() < 6) {
	   System.out.println();
	   System.out.println("> �ifre en az 6 karakterden olu�mal�d�r, kay�t yap�lamad�.");
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
