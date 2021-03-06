package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.İmage;

public interface İmageService {

	DataResult<List<İmage>> getAll();
    Result add(İmage image);
}
