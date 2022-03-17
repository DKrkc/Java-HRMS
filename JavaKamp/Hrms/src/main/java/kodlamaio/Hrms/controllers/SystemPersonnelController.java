package kodlamaio.Hrms.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.Hrms.business.abstracts.SystemPersonnelService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;

import kodlamaio.Hrms.entities.concretes.SystemPersonnel;

@RestController
@RequestMapping("/api/systemPersonnels")
public class SystemPersonnelController {
	private SystemPersonnelService systemPersonnelService;

	@Autowired
	public SystemPersonnelController(SystemPersonnelService systemPersonnelService) {
		super();
		this.systemPersonnelService = systemPersonnelService;
	}
	@GetMapping("/getall")
	public DataResult<List<SystemPersonnel>> getall() {
		return this.systemPersonnelService.getAll();
	}
	
	@PostMapping("/add")
	public Result Add(@RequestBody   SystemPersonnel systemPersonnel) {
		return this.systemPersonnelService.Add(systemPersonnel);
	}

}
