package gamesalessystem;



public class VerificationManager implements VerificationService {

	@Override
	public void dogrulama(Gamer gamer) {
		
		System.out.println("----------------------------------------------------------------------");
		   System.out.println("\t \t \t Sistem Operasyonlarý");
	    System.out.println("----------------------------------------------------------------------");
		
		if(gamer.getFirstName().length() > 4 && gamer.getLastName().length() > 4 && gamer.getDogumTarih()> 1985 && gamer.getNationalityId().length() == 11) {
			
		
			System.out.println("Sisteme giriþ baþarýlý");
		}
		else {
			System.out.println("Eksik ya da Hatalý Giriþ Yaptýnýz! ");
		}
		
	}
   
}
