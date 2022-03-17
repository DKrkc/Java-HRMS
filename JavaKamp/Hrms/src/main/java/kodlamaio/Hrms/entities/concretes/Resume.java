package kodlamaio.Hrms.entities.concretes;




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
@Table(name = "resume")
public class Resume {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "resumeId")
	private int resumeId;

//	@OneToOne()
//	@JoinColumn(name = "userId")
//	private JobSeeker jobSeeker;
//
//	@OneToOne()
//	@JoinColumn(name = "imageId")
//	private JobSeekerImage jobSeekerImage;
//
//	@OneToOne()
//	@JoinColumn(name = "educationId")
//	private EducationInfo educationInfo;
//
//	@OneToOne()
//	@JoinColumn(name = "experienceId")
//	private ExperienceInfo experienceInfo;

	@Column(name = "languageSkill")
	private String languageSkill;

	@Column(name = "languageSkillLevel")
	private String languageSkillLevel;

	@Column(name = "githubLink")
	private String githubLink;

	@Column(name = "linkedinLink")
	private String linkedinLink;

	@Column(name = "skills")
	private String skills;

	@Column(name = "summary")
	private String summary;

}
