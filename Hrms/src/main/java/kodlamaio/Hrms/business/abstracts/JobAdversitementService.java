package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;

public interface JobAdversitementService {

	
	 DataResult<List<JobAdvertisement>> getAll();
     Result add(JobAdvertisement jobAdvertisement);
}
