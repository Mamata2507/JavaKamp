package kodlamaio.Hrms.dataAccess.abstracts;






import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.Hrms.entities.concretes.JobAdvertisement;
import kodlamaio.Hrms.entities.dtos.JobAdvertisementDto;





public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{

JobAdvertisement findById(int id);
	
	@Query("Select new kodlamaio.Hrms.entities.dtos.JobAdvertisementDto"
			+ "(e.company_name, jp.position_name, j.open_position_count, j.create_date, j.application_deadline) "
			+ "From JobAdvertisement j Inner Join j.employer e Inner Join j.jobPosition jp where j.is_active=true ")
	List<JobAdvertisementDto> findByIsActive();
	
	@Query("Select new kodlamaio.Hrms.entities.dtos.JobAdvertisementDto" 
			+ "(e.company_name, jp.position_name, j.open_position_count, j.create_date, j.application_deadline)" 
			+ "From JobAdvertisement j Inner Join j.employer e Inner Join j.jobPosition jp where j.is_active=true Order By j.create_date ASC")
	List<JobAdvertisementDto> findByIsActiveOrderByApplicationDeadline();
	
	@Query("Select new kodlamaio.Hrms.entities.dtos.JobAdvertisementDto" 
			+ "(e.company_name,jp.position_name, j.open_position_count, j.create_date, j.application_deadline)"
			+ "From JobAdvertisement j Inner Join j.employer e Inner Join j.jobPosition jp where e.company_name=:company_name And j.is_active=true")
	List<JobAdvertisementDto> findByIsActiveAndEmployer_CompanyName(String company_name);
	

	

	
}
