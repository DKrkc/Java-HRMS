package kodlamaio.Hrms.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {

	private String jobPositionName;
	
 //private String companyName;

	private String description;

	private LocalDate deadline;

	private LocalDate releaseDate;

	private int numberOfPosition;

}
