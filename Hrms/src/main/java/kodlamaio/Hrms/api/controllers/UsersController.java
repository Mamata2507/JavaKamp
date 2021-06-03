package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.UsersService;
import kodlamaio.Hrms.core.utilities.results.DataResult;

import kodlamaio.Hrms.entities.concretes.Users;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	private UsersService usersService;

	@Autowired
	public UsersController(UsersService usersService) {
		super();
		this.usersService = usersService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Users>> getAll(){
    	return this.usersService.getAll();
    }
	
	

}
