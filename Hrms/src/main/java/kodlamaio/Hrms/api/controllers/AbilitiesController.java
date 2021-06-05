package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.AbilitiesService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Abilities;


@RestController
@RequestMapping("/api/abilities")
public class AbilitiesController {

	 private AbilitiesService abilitiesService;

	public AbilitiesController(AbilitiesService abilitiesService) {
		super();
		this.abilitiesService = abilitiesService;
	}
	
	 @GetMapping("/getall")
		public DataResult<List< Abilities>> getAll(){
			return this.abilitiesService.getAll();
		}
	    
	    @PostMapping("/add")
		public Result add(@RequestBody  Abilities  abilities) {
			return this.abilitiesService.add(abilities);
		}
}
