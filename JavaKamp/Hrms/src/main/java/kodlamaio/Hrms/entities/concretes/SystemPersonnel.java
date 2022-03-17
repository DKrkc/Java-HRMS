package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Entity;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import kodlamaio.Hrms.core.entities.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data

@Table(name="systemPersonnels")
@Inheritance(strategy =InheritanceType.JOINED )
@EqualsAndHashCode(callSuper = false)
public class SystemPersonnel extends User {
	
	

}
