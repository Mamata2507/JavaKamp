package kodlamaio.Hrms.entities.concretes;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_advertisement")
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "job_description")
	 @NotBlank
	 @NotNull
	private String job_description;
	
	@Column(name = "min_salary")
	private double min_salary;
	
	@Column(name = "max_salary")
	private double max_salary;
	
	@Column(name = "open_position_count")
	@NotBlank
	 @NotNull
	private int open_position_count;
	
	@Column(name = "application_deadline")
	@NotBlank
	@NotNull
	private LocalDate application_deadline;
	
	@Column(name = "create_date")

	private LocalDate create_date ;

	
	@Column(name = "is_active")
	private boolean is_active;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employer_id")
	private Employers employer;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "city_id")
	private City city;
	

	

}
