package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.CirculiumVitaeService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.CirculiumVitae;

@RestController
@RequestMapping("/api/circuliumvitae")
public class CirculiumVitaeController {

	private  CirculiumVitaeService circuliumVitaeService;

	public CirculiumVitaeController(CirculiumVitaeService circuliumVitaeService) {
		super();
		this.circuliumVitaeService = circuliumVitaeService;
	}
	
	
    @GetMapping("/getall")
	public DataResult<List<CirculiumVitae>> getAll(){
		return this.circuliumVitaeService.getAll();
	}
    
    @PostMapping("/add")
	public Result add(@RequestBody CirculiumVitae circuliumVitae) {
		return this.circuliumVitaeService.add(circuliumVitae);
	}
}
