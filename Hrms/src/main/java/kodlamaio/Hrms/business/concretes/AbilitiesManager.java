package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.AbilitiesService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.AbilitiesDao;
import kodlamaio.Hrms.entities.concretes.Abilities;

@Service
public class AbilitiesManager implements AbilitiesService{

	private AbilitiesDao abilitiesDao;

	@Autowired
	public AbilitiesManager(AbilitiesDao abilitiesDao) {
		super();
		this.abilitiesDao = abilitiesDao;
	}

	@Override
	public DataResult<List<Abilities>> getAll() {
		return new SuccessDataResult<List<Abilities>>
		(this.abilitiesDao.findAll(),"abilities listed");
	}

	@Override
	public Result add(Abilities abilities) {
		this.abilitiesDao.save(abilities);
		return new SuccessResult("abilities added");
	}
}
