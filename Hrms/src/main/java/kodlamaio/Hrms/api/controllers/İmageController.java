package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.İmageService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;

import kodlamaio.Hrms.entities.concretes.İmage;

@RestController
@RequestMapping("/api/image")
public class İmageController {

 private İmageService imageService;

public İmageController(İmageService imageService) {
	super();
	this.imageService = imageService;
}

    @GetMapping("/getall")
    public DataResult<List<İmage>> getAll(){
    	return this.imageService.getAll();
    }
    
    @PostMapping("/add")
    public  Result add(@RequestBody İmage image) {
    	return this.imageService.add(image);
    }
}
