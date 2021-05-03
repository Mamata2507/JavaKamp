package gamesalessystem;

public class SaleManager implements SaleService {

	@Override
	public void add(Gamer gamer, Campaign campaign,Game game,Sale sale) {
	 	   System.out.println(sale.getSaleId() + " numaralý satýþ iþlemi ile " + gamer.getFirstName() + " " + gamer.getLastName() + " isimli kullanýcý " + campaign.getName() +
	 			   " kampanyasýndan faydalanarak " + game.getName() + " oyunu baþarýyla satýlmýþtýr.");
    }
	
	@Override
	 public void update(Sale sale) {
  	   System.out.println(sale.getSaleId() + " nolu satýþ baþarýyla güncelenmiþtir.");
     }

	@Override
     public void delete(Sale sale) {
    	 System.out.println(sale.getSaleId() + " nolu satýþ baþarýyla silinmiþtir.");
     }
}
