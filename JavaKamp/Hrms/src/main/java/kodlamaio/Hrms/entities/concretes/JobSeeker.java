package kodlamaio.Hrms.entities.concretes;

import java.util.List;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import kodlamaio.Hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jobseekers")
@Inheritance(strategy = InheritanceType.JOINED)
@EqualsAndHashCode(callSuper = false)
public class JobSeeker extends User {
	@NotBlank
	@NotNull
	@Column(name = "nationalityId")
	private String nationalityId;

	@NotBlank
	@NotNull
	@Column(name = "birthOfDate")
	private String birthOfDate;

//	@OneToOne(mappedBy = "jobseekers")
//	private Resume resume;
//
//	@OneToOne(mappedBy = "jobseekers")
//	private JobSeekerImage jobSeekerImage;
//
//	@ManyToMany(mappedBy = "jobseekers")
//	private List<EducationInfo> educationInfo;
//
//	@ManyToMany(mappedBy = "jobseekers")
//	private List<ExperienceInfo> experienceInfo;

}
