package kodlamaio.Hrms.controllers;

import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.Hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;
import kodlamaio.Hrms.entities.dtos.JobAdvertisementDto;

@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementController {

	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}

	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getall() {
		return this.jobAdvertisementService.getAll();
	}

	//@GetMapping("/getbycompanyName")
	//public DataResult<List<JobAdvertisement>> getbycompanyName(String companyName) {
	//	return this.jobAdvertisementService.getByCompanyName(companyName);
	//}

	@GetMapping("/getbyrelasedate")
	public DataResult<List<JobAdvertisement>> getByRelaseDate(LocalDate releaseDate) {
		return this.jobAdvertisementService.getByReleaseDate(releaseDate);
	}

	@PostMapping("/add")
	public Result Add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.Add(jobAdvertisement);
	}
	
@GetMapping("/getjobaddetails")
	public DataResult<List<JobAdvertisementDto>> getJobAdvertisementWithDetails(){
	return this.jobAdvertisementService.getJobAdvertisementWithDetails();
	}
}
