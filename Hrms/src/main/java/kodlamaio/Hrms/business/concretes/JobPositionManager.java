package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobPositionService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.Hrms.entities.concretes.JobPosition;


@Service
public class JobPositionManager  implements JobPositionService{
	
    private JobPositionDao jobPositionDao;
     
    @Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}
    
    @Override
    public DataResult<List<JobPosition>> getAll(){
    	return new SuccessDataResult<List<JobPosition>>
    	(this.jobPositionDao.findAll(),"Data listelendi");
    					
    }
    
  
	@Override
    public Result add(JobPosition jobPosition){
    	this.jobPositionDao.save(jobPosition);
    	return new SuccessResult("İş pozisyonu eklendi.");
    			
    			
    }
    
}
