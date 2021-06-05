package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.CirculiumVitaeService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.CirculiumVitaeDao;
import kodlamaio.Hrms.entities.concretes.CirculiumVitae;

@Service
public class CirculiumVitaeManager implements CirculiumVitaeService{

	private CirculiumVitaeDao  circuliumVitaeDao;

	@Autowired
	public CirculiumVitaeManager(CirculiumVitaeDao circuliumVitaeDao) {
		super();
		this.circuliumVitaeDao = circuliumVitaeDao;
	}

	@Override
	public DataResult<List<CirculiumVitae>> getAll() {
    return new SuccessDataResult<List<CirculiumVitae>>
    (this.circuliumVitaeDao.findAll(),"circulium vitae listed");
	}

	@Override
	public Result add(CirculiumVitae circuliumVitae) {
		this.circuliumVitaeDao.save(circuliumVitae);
		return new SuccessResult("circulium vitae added");
	}
}
