package kodlamaio.Hrms.entities.concretes;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jobAdvertisements")

public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "jobAdvertisementId")
	private int jobAdvertisementId;

	@NotBlank
	@NotNull
	@Column(name = "minSalary")
	private double minSalary;

	@NotBlank
	@NotNull
	@Column(name = "maxSalary")
	private double maxSalary;

	@NotBlank
	@NotNull
	@Column(name = "description")
	private String description;

	@NotBlank
	@NotNull
	@Column(name = "deadline")
	private LocalDate deadline;

	@NotBlank
	@NotNull
	@Column(name = "releaseDate")
	private LocalDate releaseDate;

	@NotBlank
	@NotNull
	@Column(name = "numberOfPosition")
	private int numberOfPosition;

	@NotBlank
	@NotNull
	@ManyToOne()
	@JoinColumn(name = "jobPositionId")
	private JobPosition jobPosition;

	@NotBlank
	@NotNull
	@ManyToOne()
	@JoinColumn(name = "cityId")
	private City city;

	@NotBlank
	@NotNull
	@ManyToOne()
	@JoinColumn(name = "employerId")
	private Employer employer;

}

// position id zorunlu
// city id zorunlu
// min maaş
// max maaş
// description zorunlu
// deadlineForAppliying
// numberOfPosition zorunlu

//isActive  --> if deadline<Date.now then isActive=false;


//DataReult<List<jobAd>> getAll(){
//if(checkIsActive()){
//this.jobAdDao.findAll();
//}
//}

//Deadline>Date.Now then active already!
