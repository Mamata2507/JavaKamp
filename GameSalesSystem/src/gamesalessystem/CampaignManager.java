package gamesalessystem;

public class CampaignManager implements CampainService{

    @Override
	public void add(Game game,Campaign campaign) {
	 	   System.out.println(campaign.getId() + " numaral� kampanya " + game.getName() + " oyununa ba�ar�yla eklenmi�tir.");
    }
	
    @Override
	 public void update(Campaign campaign) {
		 System.out.println(campaign.getId() + " numaral� kampanya ba�ar�yla g�ncellenmi�tir.");
     }

    @Override
     public void delete(Campaign campaign) {
    	 System.out.println(campaign.getId() + " numaral� kampanya ba�ar�yla silinmi�tir.");
     }


	@Override
	public void allCampaign(Campaign[] campaigns,Game game) {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("\t \t  Sitemizdeki T�m Kampanyalar Ve �ndirimleri ");
		System.out.println("----------------------------------------------------------------------");
		
		for (Campaign campaign : campaigns) {
			System.out.println(game.getName() + " oyununun " + campaign.getName() + " ile indirimli sat�� fiyat� ->  " + game.getPrice() % campaign.getDiscount());
		}
		
	}

	

}
