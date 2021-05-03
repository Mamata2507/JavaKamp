package gamesalessystem;

public interface CampainService {
	void add(Game game,Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	void allCampaign(Campaign[] campaigns,Game game);
}
