package kodlamaio.Hrms.business.abstracts;

import java.time.LocalDate;


import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;

import kodlamaio.Hrms.entities.dtos.JobAdvertisementDto;


public interface JobAdvertisementService {
DataResult<List<JobAdvertisement>> getAll();
Result Add(JobAdvertisement jobAdvertisement);
Result Delete(JobAdvertisement jobAdvertisement);
DataResult<List<JobAdvertisementDto>> getJobAdvertisementWithDetails();
DataResult<List<JobAdvertisement>> getByReleaseDate(LocalDate releaseDate);
//DataResult<List<JobAdvertisement>> getByCompanyName(String companyName);
}
