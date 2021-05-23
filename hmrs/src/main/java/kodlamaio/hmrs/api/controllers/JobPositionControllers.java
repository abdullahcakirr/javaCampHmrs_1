package kodlamaio.hmrs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hmrs.business.abstracts.JobPositionService;
import kodlamaio.hmrs.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobPosition")
public class JobPositionControllers  {
	
	@Autowired
	private JobPositionService jobPositionService;
	
	
	@Autowired
	public JobPositionControllers() {
		
	}


	@Autowired
	public JobPositionControllers(JobPositionService jobPositionService) {
		
		this.jobPositionService = jobPositionService;
	}


	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		
		return this.jobPositionService.getAll();
	
	}
	
}
