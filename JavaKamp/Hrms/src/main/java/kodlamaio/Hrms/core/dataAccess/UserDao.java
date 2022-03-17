package kodlamaio.Hrms.core.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {
	User getByFirstName(String userName);

	User getByFirstNameOrLastName(String firstName, String lastName);

	List<User> getByFirstNameContains(String firstName);

}