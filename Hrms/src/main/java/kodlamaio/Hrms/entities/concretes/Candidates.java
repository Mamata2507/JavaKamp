package kodlamaio.Hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.apache.tomcat.jni.User;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "candidates")
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Candidates extends User {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "first_name")
	@NotBlank
	 @NotNull
	private String first_name;
	
	@Column(name = "last_name")
	@NotBlank
	 @NotNull
	private String last_name;
	
	@Column(name = "identity_number")
	@NotBlank
	@NotNull
	private String identity_number;
	
	@Column(name = "birth_date")
	@NotBlank
	 @NotNull
	private LocalDate birth_date;
	
  @JsonIgnore
  @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "circulium_vitae_id")
  private CirculiumVitae circulium_vitae;
}
