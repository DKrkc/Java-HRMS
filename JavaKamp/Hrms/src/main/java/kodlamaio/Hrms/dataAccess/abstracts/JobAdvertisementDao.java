package kodlamaio.Hrms.dataAccess.abstracts;

import java.time.LocalDate;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.Hrms.entities.concretes.JobAdvertisement;
import kodlamaio.Hrms.entities.dtos.JobAdvertisementDto;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	// @Query("Select new kodlamaio.Hrms.entities.dtos.JobAdvertisementDto
	// (e.companyName, j.jobPositionName, j.numberOfPosition,
	// j.deadlineForAppliying, j.releaseDateForAppliying) From Employer e Inner Join
	// e.jobAdvertisements j ")
	// List<JobAdvertisementDto> getJobAdvertisementWithEmployerDetails();

	List<JobAdvertisement> getByReleaseDate(LocalDate releaseDate);
	// List<JobAdvertisement> getByCompanyName(String companyName);

//	@Query(value = "Select * " + "FROM JobAdvertisement jobAd INNER JOIN Employer e " +
//             "ON jobAd.employerId = e.employerId " + "INNER JOIN JobPosition jp" +
//            		 "ON jobAd.jobPositionId=jp.jobPositionId" )
//           
             
	@Query("Select new kodlamaio.Hrms.entities.dtos.JobAdvertisementDto(jobPo.jobPositionName, a.description, a.deadline, a.releaseDate, a.numberOfPosition)"
			+"From JobPosition jobPo Inner Join jobPo.jobAdvertisements a "
			)
	
			
	 List<JobAdvertisementDto> getJobAdvertisementWithDetails();

}
