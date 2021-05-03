package gamesalessystem;

public class SaleManager implements SaleService {

	@Override
	public void add(Gamer gamer, Campaign campaign,Game game,Sale sale) {
	 	   System.out.println(sale.getSaleId() + " numaral� sat�� i�lemi ile " + gamer.getFirstName() + " " + gamer.getLastName() + " isimli kullan�c� " + campaign.getName() +
	 			   " kampanyas�ndan faydalanarak " + game.getName() + " oyunu ba�ar�yla sat�lm��t�r.");
    }
	
	@Override
	 public void update(Sale sale) {
  	   System.out.println(sale.getSaleId() + " nolu sat�� ba�ar�yla g�ncelenmi�tir.");
     }

	@Override
     public void delete(Sale sale) {
    	 System.out.println(sale.getSaleId() + " nolu sat�� ba�ar�yla silinmi�tir.");
     }
}
