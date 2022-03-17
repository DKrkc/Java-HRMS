package kodlamaio.Hrms.entities.concretes;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "experienceInfos")
public class ExperienceInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "experienceId")
	private int experienceId;
//
//	@ManyToMany()
//	@JoinTable(name = "jobSeeker_experinece",
//	joinColumns = @JoinColumn(name = "experience_id"),
//	inverseJoinColumns = @JoinColumn(name = "user_id"))
//	private List<JobSeeker> jobSeeker;

	@Column(name = "experienceCompanyName")
	private String experiencecompanyName;

	@Column(name = "experiencePositionName")
	private String experiencePositionName;

	@Column(name = "expStartDate")
	private LocalDate expStartDate;

	// can be empty
	@Column(name = "expEndDate")
	private LocalDate expEndDate;

//	@OneToOne(mappedBy = "experienceInfos")
//	private Resume resume;
}
