package kodlamaio.Hrms.business.concretes;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.UserService;
import kodlamaio.Hrms.core.dataAccess.UserDao;
import kodlamaio.Hrms.core.entities.User;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
@Service
public class UserManager implements UserService {

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>(this.userDao.findAll(), "Listed");
	}

	@Override
	public Result Add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Added");
	}

	

	@Override
	public Result Delete(User user) {
		this.userDao.delete(user);
		return new SuccessResult("Deleted");
	}

	@Override
	public DataResult<User> getByFirstName(String firstName) {
		return new SuccessDataResult<User>(this.userDao.getByFirstName(firstName),"Data getirildi.");
		
	}

	@Override
	public DataResult<User> getByFirstNameOrLastName(String firstName, String lastName) {
		return new SuccessDataResult<User>(this.userDao.getByFirstNameOrLastName(firstName, lastName));
	}

	@Override
	public DataResult<List<User>> getByFirstNameContains(String firstName) {
		return new SuccessDataResult<List<User>>(this.userDao.getByFirstNameContains(firstName));
	}

	@Override
	public DataResult<List<User>> getAll(int pageNo, int pageSize) {
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		return new SuccessDataResult<List<User>>(this.userDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<User>> getAllShorted() {
		Sort sort=Sort.by(Sort.Direction.ASC, "lastName");
		return new SuccessDataResult<List<User>>(this.userDao.findAll(sort));
	}

}
