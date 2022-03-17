package kodlamaio.Hrms.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
@Inheritance(strategy =InheritanceType.JOINED )
@EqualsAndHashCode(callSuper = false)
public class User {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userId")
	private int userId;
	
	@NotBlank
	@NotNull
	@Column(name="firstName")
	private String firstName;
	
	@NotBlank
	@NotNull
	@Column(name="lastName")
	private String lastName;
	
    
	@Column(name="mail" , unique = true)
	@Email
	@NotBlank
	@NotNull
	private String mail;

}
