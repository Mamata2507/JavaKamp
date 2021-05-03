package gamesalessystem;

public class CampaignManager implements CampainService{

    @Override
	public void add(Game game,Campaign campaign) {
	 	   System.out.println(campaign.getId() + " numaralý kampanya " + game.getName() + " oyununa baþarýyla eklenmiþtir.");
    }
	
    @Override
	 public void update(Campaign campaign) {
		 System.out.println(campaign.getId() + " numaralý kampanya baþarýyla güncellenmiþtir.");
     }

    @Override
     public void delete(Campaign campaign) {
    	 System.out.println(campaign.getId() + " numaralý kampanya baþarýyla silinmiþtir.");
     }


	@Override
	public void allCampaign(Campaign[] campaigns,Game game) {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("\t \t  Sitemizdeki Tüm Kampanyalar Ve Ýndirimleri ");
		System.out.println("----------------------------------------------------------------------");
		
		for (Campaign campaign : campaigns) {
			System.out.println(game.getName() + " oyununun " + campaign.getName() + " ile indirimli satýþ fiyatý ->  " + game.getPrice() % campaign.getDiscount());
		}
		
	}

	

}
