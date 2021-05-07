package eTicaretSystem.core;

import eTicaretSystem.entities.concrete.Customer;
import eTicaretSystem.logInWithGoogle.LogInWithGoogleManager;

public class LogInWithGoogleManagerAdapter implements LogInWithService{

	@Override
	public void login(Customer customer) {
		
		LogInWithGoogleManager googleManager = new LogInWithGoogleManager();
		googleManager.login(customer);
	}

	@Override
	public void register(Customer customer) {
		
		LogInWithGoogleManager googleManager = new LogInWithGoogleManager();
		googleManager.register(customer);
		
	}
       
		
        
}
