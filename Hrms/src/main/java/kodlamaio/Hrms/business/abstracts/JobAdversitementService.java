package kodlamaio.Hrms.business.abstracts;


import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;
import kodlamaio.Hrms.entities.dtos.JobAdvertisementDto;




public interface JobAdversitementService {

	
	Result add(JobAdvertisement jobAdvertisement);
	Result delete(int id);
	
	DataResult<JobAdvertisement> findById(int id);
	DataResult<List<JobAdvertisementDto>> findByIsActive();
	DataResult<List<JobAdvertisementDto>> findByIsActiveOrderByApplicationDeadline();
	DataResult<List<JobAdvertisementDto>> findByIsActiveAndEmployer_CompanyName(String companyName);
}
