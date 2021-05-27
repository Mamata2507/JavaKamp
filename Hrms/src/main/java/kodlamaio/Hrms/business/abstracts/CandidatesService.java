package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Candidates;

public interface CandidatesService {

	      DataResult<List<Candidates>> getAll();
	      Result add(Candidates candidates);
}
