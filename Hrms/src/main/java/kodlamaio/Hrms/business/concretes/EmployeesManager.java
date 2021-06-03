package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.EmployeesService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.EmployeesDao;
import kodlamaio.Hrms.entities.concretes.Employees;

@Service
public class EmployeesManager implements EmployeesService{

	private EmployeesDao employeesDao;
   
	@Autowired
	public EmployeesManager(EmployeesDao employeesDao) {
		super();
		this.employeesDao = employeesDao;
	}

	@Override
	public DataResult<List<Employees>> getAll() {
		return new SuccessDataResult<List<Employees>>
		(this.employeesDao.findAll(),"Employees listed");
	}
	
	@Override
	public Result add(Employees employees) {
	 this.employeesDao.save(employees);
	 return new SuccessResult("Employees added");
	}
}
