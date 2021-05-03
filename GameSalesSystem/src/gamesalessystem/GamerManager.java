package gamesalessystem;

public class GamerManager   implements GamerService{


	@Override
	public void add(Gamer gamer) {
 	   System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " adlý kullanýcý sisteme eklendi.");
    }
	
	@Override
	 public void update(Gamer gamer) {
		 System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " adlý kullanýcýnýn bilgileri sistemde güncellendi.");
     }

	@Override
     public void delete(Gamer gamer) {
    	 System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " adlý kullanýcý sistemden silindi.");
    	
     }

	
}
