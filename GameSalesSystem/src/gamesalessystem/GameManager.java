package gamesalessystem;

public class GameManager implements GameService{

   @Override
	public void add(Game game) {
	 	   System.out.println(game.getName() + " oyunu ba�ar�yla eklendi.");
    }
	
   @Override
	 public void update(Game game) {
		 System.out.println(game.getName() + " oyunu ba�ar�yla g�ncellendi.");
     }

   @Override
     public void delete(Game game) {
    	 System.out.println(game.getName() + " oyunu ba�ar�yla silindi.");
     }
   @Override
public void allGames (Game[] games) {
	   System.out.println("----------------------------------------------------------------------");
	   System.out.println("\t \t \t Sitemizdeki T�m Oyunlar");
	   System.out.println("----------------------------------------------------------------------");
	   for (Game game : games) {
		System.out.println(game.getName());
	}
   }
}
