package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Employees;

public interface EmployeesService {
              
	             DataResult<List<Employees>> getAll();
	             Result add(Employees employees);
}
