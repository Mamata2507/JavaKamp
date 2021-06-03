package kodlamaio.Hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobAdversitementService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;
import kodlamaio.Hrms.entities.dtos.JobAdvertisementDto;





@Service
public class JobAdversitementManager implements JobAdversitementService{

	private JobAdvertisementDao jobAdversitementDao;
	
	@Autowired
	public JobAdversitementManager(JobAdvertisementDao jobAdversitementDao) {
		super();
		this.jobAdversitementDao = jobAdversitementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdversitementDao.save(jobAdvertisement);
		return new SuccessResult("Job advertisement added.");
	}

	@Override
	public Result delete(int id) {
		this.jobAdversitementDao.deleteById(id);
		return new SuccessResult("Job advertisement could not be removed");
	}

	@Override
	public DataResult<JobAdvertisement> findById(int id) {
		return new SuccessDataResult<JobAdvertisement>
		(this.jobAdversitementDao.getOne(id));
		
	}

	@Override
	public DataResult<List<JobAdvertisementDto>> findByIsActive() {
		return new SuccessDataResult<List<JobAdvertisementDto>>
		(this.jobAdversitementDao.findByIsActive(),"Active job advertisements listed");
	}

	@Override
	public DataResult<List<JobAdvertisementDto>> findByIsActiveOrderByApplicationDeadline() {
		return new SuccessDataResult<List<JobAdvertisementDto>>
		(this.jobAdversitementDao.findByIsActiveOrderByApplicationDeadline(),"All active job advertisements listed by date.");
	}

	@Override
	public DataResult<List<JobAdvertisementDto>> findByIsActiveAndEmployer_CompanyName(String companyName) {
		return new SuccessDataResult<List<JobAdvertisementDto>>
		(this.jobAdversitementDao.findByIsActiveAndEmployer_CompanyName(companyName),"All active job advertisements belonging to the company listed");
	}


	



	


	








	

	
	





	

}
