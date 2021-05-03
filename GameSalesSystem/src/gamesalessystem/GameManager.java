package gamesalessystem;

public class GameManager implements GameService{

   @Override
	public void add(Game game) {
	 	   System.out.println(game.getName() + " oyunu baþarýyla eklendi.");
    }
	
   @Override
	 public void update(Game game) {
		 System.out.println(game.getName() + " oyunu baþarýyla güncellendi.");
     }

   @Override
     public void delete(Game game) {
    	 System.out.println(game.getName() + " oyunu baþarýyla silindi.");
     }
   @Override
public void allGames (Game[] games) {
	   System.out.println("----------------------------------------------------------------------");
	   System.out.println("\t \t \t Sitemizdeki Tüm Oyunlar");
	   System.out.println("----------------------------------------------------------------------");
	   for (Game game : games) {
		System.out.println(game.getName());
	}
   }
}
