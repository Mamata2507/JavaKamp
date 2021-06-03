package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.JobAdversitementService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;
import kodlamaio.Hrms.entities.dtos.JobAdvertisementDto;





@RestController
@RequestMapping("/api/jobadvertisement")
public class JobAdvertisementController {
	private JobAdversitementService jobAdvertisementService;

	public JobAdvertisementController(JobAdversitementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	

	
    @PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
    
    @DeleteMapping("/delete")
    public Result delete(@RequestBody int id) {
    	return this.jobAdvertisementService.delete(id);
    }
    
    @GetMapping("/findByIsActive")
    DataResult<List<JobAdvertisementDto>> findByIsActive(){
    	return this.jobAdvertisementService.findByIsActive();
    }
 
    @GetMapping("/findByIsActiveOrderByApplicationDeadline")
    DataResult<List<JobAdvertisementDto>> findByIsActiveOrderByApplicationDeadline(){
    	return this.jobAdvertisementService.findByIsActiveOrderByApplicationDeadline();
    }
    
    @GetMapping("/findByIsActiveAndEmployer_CompanyName")
    DataResult<List<JobAdvertisementDto>> findByIsActiveAndEmployer_CompanyName(String companyName){
    	return this.jobAdvertisementService.findByIsActiveAndEmployer_CompanyName(companyName);
    }
   
}
