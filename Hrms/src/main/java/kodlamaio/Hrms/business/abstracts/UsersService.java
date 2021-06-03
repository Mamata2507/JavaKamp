package kodlamaio.Hrms.business.abstracts;

import java.util.List;



import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.entities.concretes.Users;

public interface UsersService {
	DataResult<List<Users>> getAll();
}
