package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.entities.User;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;

public interface UserService {

	DataResult<List<User>> getAll();

	Result Add(User user);

	// Result UpDate(User user);
	Result Delete(User user);

	DataResult<User> getByFirstName(String firstName);

	DataResult<User> getByFirstNameOrLastName(String firstName, String lastName);
	DataResult<List<User>> getByFirstNameContains(String firstName);
	DataResult<List<User>> getAll(int pageNo,int pageSize);
	DataResult<List<User>> getAllShorted();
}
