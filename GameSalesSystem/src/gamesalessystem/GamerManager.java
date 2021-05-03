package gamesalessystem;

public class GamerManager   implements GamerService{


	@Override
	public void add(Gamer gamer) {
 	   System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " adl� kullan�c� sisteme eklendi.");
    }
	
	@Override
	 public void update(Gamer gamer) {
		 System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " adl� kullan�c�n�n bilgileri sistemde g�ncellendi.");
     }

	@Override
     public void delete(Gamer gamer) {
    	 System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " adl� kullan�c� sistemden silindi.");
    	
     }

	
}
