package kodlamaio.Hrms.entities.concretes;



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
@Table(name = "foreign_language")
public class ForeignLanguage {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
    
    @Column(name = "language_name")
    private String language_name;
    
    @Column(name = "language_level")
    private String language_level;
    
    @JsonIgnore
   	@OneToMany(mappedBy = "foreign_language")
   	private List<CirculiumVitae> circuliumVitaes;
}
