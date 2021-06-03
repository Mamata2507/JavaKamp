package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Employers;


public interface EmployersService {
 
	       DataResult<List<Employers>> getAll();
	       Result add(Employers employers);
	       
	     
	      
}

