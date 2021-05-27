package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity

@Table(name = "employers")

public class Employers extends Users{
    
	
	@Column(name = "company_name")
	private String company_name;
	
	@Column(name = "web_address")
	private String web_address;
	
	@Column(name = "phone_number")
	private String phone_number;
	
	@Column(name = "is_activated")
	private boolean is_activated;
}
