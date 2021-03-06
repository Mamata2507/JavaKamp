package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Abilities;


public interface AbilitiesService {

	 DataResult<List<Abilities>> getAll();
     Result add(Abilities abilities);
}
