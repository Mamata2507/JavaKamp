package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.EmployeesService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Employees;

@RestController
@RequestMapping("/api/employees")
public class EmployessController {
   
	private EmployeesService employeesService;

	@Autowired
	public EmployessController(EmployeesService employeesService) {
		super();
		this.employeesService = employeesService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employees>> getAll(){
		return this.employeesService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employees employees) {
		return this.employeesService.add(employees);
	}
}
