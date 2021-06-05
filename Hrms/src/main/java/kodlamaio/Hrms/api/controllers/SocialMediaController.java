package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.SocialMediaService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;

import kodlamaio.Hrms.entities.concretes.SocialMedia;

@RestController
@RequestMapping("/api/socialmedia")
public class SocialMediaController {

	private SocialMediaService socialMediaService;

	@Autowired
	public SocialMediaController(SocialMediaService socialMediaService) {
		super();
		this.socialMediaService = socialMediaService;
	}
	
	 @GetMapping("/getall")
		public DataResult<List<SocialMedia>> getAll(){
			return this.socialMediaService.getAll();
		}
	 
	 @PostMapping("/add")
		public Result add(@RequestBody SocialMedia socialMedia) {
			return this.socialMediaService.add(socialMedia);
		}
}
