package kodlamaio.Hrms.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.Hrms.business.abstracts.EducationInfoService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;

import kodlamaio.Hrms.entities.concretes.EducationInfo;

@RestController
@RequestMapping("/api/educationınfos")
public class EducationInfoController {

	private EducationInfoService educationInfoService;

	@Autowired
	public EducationInfoController(EducationInfoService educationInfoService) {
		super();
		this.educationInfoService = educationInfoService;
	}

	
//	@GetMapping("/getall")
//	public DataResult<EducationInfo> getByUserIdOrderBySchoolEndDate(int userId){
//		return this.educationInfoService.getByUserIdOrderBySchoolEndDate(userId);
//	}
	@PostMapping("/add")
	public Result Add(@RequestBody EducationInfo educationInfo) {
		return this.educationInfoService.Add(educationInfo);
	}
}
