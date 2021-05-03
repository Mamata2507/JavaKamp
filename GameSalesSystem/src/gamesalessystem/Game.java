package gamesalessystem;

public class Game {
    private int id;
    private String name;
    private String description;
    private String gameCompany;
    private double price;
    private String gameCampaign;
    
    public Game() {
    	
    }
    
	public Game(int id, String name, String description, String gameCompany, double price, String gameCampaign) {

		this.id = id;
		this.name = name;
		this.description = description;
		this.gameCompany = gameCompany;
		this.price = price;
		this.gameCampaign = gameCampaign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGameCompany() {
		return gameCompany;
	}

	public void setGameCompany(String gameCompany) {
		this.gameCompany = gameCompany;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getGameCampaign() {
		return gameCampaign;
	}

	public void setGameCampaign(String gameCampaign) {
		this.gameCampaign = gameCampaign;
	}
}
