package kodlamaio.Hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity

@Table(name = "candidates")
public class Candidates extends Users{
  
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
	@Column(name = "identity_number")
	private String identity_number;
	
	@Column(name = "birth_date")
	private Date birth_date;
}
