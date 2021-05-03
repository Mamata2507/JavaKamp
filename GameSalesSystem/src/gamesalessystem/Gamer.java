package gamesalessystem;



public class Gamer {
	 private int id;
	 private String eMail;
     private String firstName;
     private String lastName;
     private int dogumTarih;
     private String nationalityId;
     private String userName;
     private String password;
     
     public Gamer() {
    	 
     }
     
     
	public Gamer(int id, String eMail,String firstName, String lastName, int dogumTarih, String nationalityId, String userName,
			String password) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.dogumTarih = dogumTarih;
		this.nationalityId = nationalityId;
		this.userName = userName;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getDogumTarih() {
		return dogumTarih;
	}


	public void setDogumTarih(int dogumTarih) {
		this.dogumTarih = dogumTarih;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
}
