package kodlamaio.Hrms.entities.concretes;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "educationInfos")
public class EducationInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "educationId")
	private int educationId;

//	@ManyToMany()
//	@JoinTable(name = "jobSeeker_education", 
//	joinColumns = @JoinColumn(name="education_id"), 
//	inverseJoinColumns = @JoinColumn(name = "user_id"))
//	private List<JobSeeker> jobSeeker;

	@Column(name = "schoolName")
	private String schoolName;

	@Column(name = "schoolStartDate")
	private LocalDate schoolStartDate;

	// can be empty
	@Column(name = "schoolEndDate")
	private LocalDate schoolEndDate;

//	@OneToOne(mappedBy = "educationInfos")
//	private Resume resume;

}
