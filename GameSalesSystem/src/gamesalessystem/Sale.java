package gamesalessystem;

public class Sale {
     private int saleId;
     private int saleCard;
     
     public Sale() {
    	 
     }
     
	public Sale(int saleId, int saleCard) {
		
		this.saleId = saleId;
		this.saleCard = saleCard;
	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public int getSaleCard() {
		return saleCard;
	}

	public void setSaleCard(int saleCard) {
		this.saleCard = saleCard;
	}
	
}
