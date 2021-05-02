package homework2;

public class User {
   private int id;
   private String firstName;
   private String LastName;
   private String eMail;
   
   public User() {
	   
   }
   
public User(int id,String firstName,String LastName,String eMail) {
	   this.setId(id);
	   this.setFirstName(firstName);
	   this.setLastName(LastName);
	   this.seteMail(eMail);
   }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return LastName;
}

public void setLastName(String lastName) {
	LastName = lastName;
}

public String geteMail() {
	return eMail;
}

public void seteMail(String eMail) {
	this.eMail = eMail;
}



}
