package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.İmageService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.İmageDao;
import kodlamaio.Hrms.entities.concretes.İmage;

@Service
public class İmageManager implements İmageService{

	private İmageDao imageDao;

	@Autowired
	public İmageManager(İmageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}

	@Override
	public DataResult<List<İmage>> getAll() {
		return new SuccessDataResult<List<İmage>>
		(this.imageDao.findAll(),"image listed");
	}

	@Override
	public Result add(İmage image) {
		this.imageDao.save(image);
		return new SuccessResult("image added");
	}
	
}
