package kodlamaio.Hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "circuliumVitaes"})
@Table(name = "job_experience")
public class JobExperience {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
    
    @Column(name = "workplace_name")
    private String workplace_name;
    
    @Column(name = "position")
    private String position;
    
    @Column(name = "start_date")
    private LocalDate start_date;
    
    
    @Column(name = "finish_date")
    private LocalDate finish_date;
    
    @JsonIgnore
   	@OneToMany(mappedBy = "job_experience")
   	private List<CirculiumVitae> circuliumVitaes;
}
