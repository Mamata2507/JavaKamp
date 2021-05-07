package eTicaretSystem;

import eTicaretSystem.business.abstracts.CustomerService;
import eTicaretSystem.business.concrete.CustomerManager;
import eTicaretSystem.core.LogInWithGoogleManagerAdapter;
import eTicaretSystem.dataAccess.concrete.HibernateCustomerDao;
import eTicaretSystem.entities.concrete.Customer;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer(1, "Muhammed", "Dibek", "eren.dibek@gmail.com", "123456");
		Customer customer2 = new Customer(2, "Burak", "Yýlmaz", "burak.yýlmaz@gmail.com", "357911");

		Customer[] customers = { customer, customer2 };

		CustomerService customerService = new CustomerManager(new HibernateCustomerDao(),
				new LogInWithGoogleManagerAdapter());
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");

		System.out.println("*************************************************************************************************************************");
		System.out.println("\t \t \t \t \t => KAYIT ÝÞLEMLERÝ EKRANI <= ");
		System.out.println("*************************************************************************************************************************");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");

		customerService.register(customers);
		System.out.println();

		System.out.println("*************************************************************************************************************************");
		System.out.println("\t \t \t \t \t => GÝRÝÞ ÝÞLEMLERÝ EKRANI <= ");
		System.out.println("*************************************************************************************************************************");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");

		customerService.login(customers);
		System.out.println();

		System.out.println("*************************************************************************************************************************");
		System.out.println("\t \t \t \t  => GOOGLE ÝLE GÝRÝÞ ÝÞLEMLERÝ EKRANI <=");
		System.out.println("*************************************************************************************************************************");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");

		customerService.registerWithGoogle(customers);
		customerService.loginWithGoogle(customers);
		System.out.println();

		System.out.println("*************************************************************************************************************************");
		System.out.println("\t \t \t \t => E-TÝCARET SÝSTEMÝ ÝÞLEM PANELÝ EKRANLARI <= ");
		System.out.println("*************************************************************************************************************************");

		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println();

		System.out.println("*************************************************************************************************************************");
		System.out.println("\t \t \t \t => E-MAÝL DOÐRULAMASI GÖNDERME EKRANI <= ");
		System.out.println("*************************************************************************************************************************");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");

		customerService.emailValidation(customers);
		System.out.println();

		System.out.println("*************************************************************************************************************************");
		System.out.println("\t \t \t \t => E-MAÝL DOÐRULAMA LÝNKÝ EKRANI <= ");
		System.out.println("*************************************************************************************************************************");
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");

		customerService.emailValidationcheck(customers);
		System.out.println();
	}

}
