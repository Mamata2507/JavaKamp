package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.CandidatesService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.CandidatesDao;
import kodlamaio.Hrms.entities.concretes.Candidates;

@Service
public class CandidatesManager implements CandidatesService{

	private CandidatesDao candidatesDao;

	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao) {
		super();
		this.candidatesDao = candidatesDao;
	}



	@Override
	public DataResult<List<Candidates>> getAll() {
		return new SuccessDataResult<List<Candidates>>
		(this.candidatesDao.findAll(),"Candidate listed");
	}

	
	@Override
	public Result add(Candidates candidates) {
		this.candidatesDao.save(candidates);
		return new SuccessResult("Candidate added");
	}




}
