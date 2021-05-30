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


@Service
public class JobAdversitementManager implements JobAdversitementService{

	private JobAdvertisementDao jobAdversitementDao;
	
	public JobAdversitementManager(JobAdvertisementDao jobAdversitementDao) {
		super();
		this.jobAdversitementDao = jobAdversitementDao;
	}


	@Autowired


	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdversitementDao.findAll(),"Data eklendi");
		
	}

	
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdversitementDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı eklendi");
		
	}

}
