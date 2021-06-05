package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.CirculiumVitae;


public interface CirculiumVitaeService {

	
	 DataResult<List<CirculiumVitae>> getAll();
     Result add(CirculiumVitae circuliumVitae);
}
