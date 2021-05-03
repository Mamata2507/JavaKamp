package gamesalessystem;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------------------------------");
		   System.out.println("\t \t \t OPERASYONLAR");
	    System.out.println("----------------------------------------------------------------------");
		   
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Muhammed");
		gamer.setLastName("Dibek");
		gamer.setDogumTarih(2001);
		gamer.seteMail("muhammed.dibek@gmail.com");
		gamer.setNationalityId("12345678910");
		gamer.setUserName("muhammeddibek57");
		gamer.setPassword("123456");
		
		Gamer[] gamers = {gamer};
		
		
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setName("Yaz Ýndirimi");
		campaign.setDescription("Bu kampanyadan 50 Tl üstü alýþveriþ yapanlar katýlabilir.");
		campaign.setDiscount(50);
		
		Campaign[] campaigns = {campaign};
		
		
		Game game = new Game();
		game.setId(1);
		game.setName("Gta V");
		game.setDescription("Gerçekçi Hayat Oyunu");
		game.setGameCompany("Rockstar Games");
		game.setGameCampaign("Yaz Kampanyasý");
		game.setPrice(99.0);
		
		Game[] games = {game};
		
		
		Sale sale = new Sale();
		sale.setSaleId(1);
		sale.setSaleCard(1234567891);
		
		Sale[] sales = {sale};
		
		
		System.out.println("----------------------------------------------------------------------");
		   System.out.println("\t \t \t Kullanýcý Operasyonlarý");
		System.out.println("----------------------------------------------------------------------");
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		
		System.out.println("----------------------------------------------------------------------");
		   System.out.println("\t \t \t Oyun Operasyonlarý");
		System.out.println("----------------------------------------------------------------------");
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.update(game);
		gameManager.delete(game);
		gameManager.allGames(games);
		
		System.out.println("----------------------------------------------------------------------");
		   System.out.println("\t \t \t Kampanya Operasyonlarý");
		System.out.println("----------------------------------------------------------------------");
		
		CampaignManager companyManager = new CampaignManager();
		companyManager.add( game,campaign);
		companyManager.update(campaign);
		companyManager.delete(campaign);
		companyManager.allCampaign(campaigns,game);
		
		System.out.println("----------------------------------------------------------------------");
		   System.out.println("\t \t \t Satýþ Operasyonlarý");
		System.out.println("----------------------------------------------------------------------");
		
		SaleManager salesManager = new SaleManager();
		salesManager.add(gamer,campaign,game,sale);
		salesManager.update(sale);
		salesManager.delete(sale);
		System.out.println("----------------------------------------------------------------------");
		
		
		VerificationManager manager = new VerificationManager();
		manager.dogrulama(gamer);
		
		
		

	}

}
