package kodlamaio.Hrms.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.Hrms.business.abstracts.UserService;
import kodlamaio.Hrms.core.entities.User;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.ErrorDataResult;


@RestController
@RequestMapping("/api/users")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/getall")
	public DataResult<List<User>> getall() {
		return this.userService.getAll();

	}

	@PostMapping("/add")
	public ResponseEntity<?> Add(@Valid @RequestBody User user) {
		return  ResponseEntity.ok(this.userService.Add(user));
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
		Map<String,String> validationErrors=new HashMap<String,String>();
		for(FieldError fieldError: exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		ErrorDataResult<Object> errors=new ErrorDataResult<Object>(validationErrors,"Doğrulama hataları");
		return errors;
		
	}

	@GetMapping("/getuserbyfirstname")
	public DataResult<User> getByFirstName(@RequestParam String firstName) {
		return this.userService.getByFirstName(firstName);

	}

	@GetMapping("/getusernamecontains")
	public DataResult<List<User>> getByFirstNameContains(@RequestParam String firstName) {
		return this.userService.getByFirstNameContains(firstName);

	}

	@GetMapping("/getallbypage")
	DataResult<List<User>> getAll(int pageNo, int pageSize) {
		return this.userService.getAll(pageNo - 1, pageSize);
	}

	@GetMapping("/getallbyshorted")
	public DataResult<List<User>> getAllShorted() {
		return this.userService.getAllShorted();
	}
	
	

}
