package gamesalessystem;

public interface SaleService {
	 void add(Gamer gamer, Campaign campaign,Game game,Sale sale);
	 void update(Sale sale);
	 void delete(Sale sale);
}
