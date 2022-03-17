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
@Table(name="jobSeekerImages")
public class JobSeekerImage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "imageId")
	private int imageId;

	@Column(name="imagePath")
	private String imagePath;
	
//
//	@OneToOne()
//	@JoinColumn(name = "userId")
//  private JobSeeker jobSeeker;
//	
//	@OneToOne(mappedBy = "jobSeekerImages")
//	private Resume resume;
	
	
}
