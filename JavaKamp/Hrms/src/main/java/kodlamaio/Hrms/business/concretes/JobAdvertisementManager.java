package kodlamaio.Hrms.business.concretes;

import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobAdvertisementDao;

import kodlamaio.Hrms.entities.concretes.JobAdvertisement;
import kodlamaio.Hrms.entities.dtos.JobAdvertisementDto;

//import kodlamaio.Hrms.entities.dtos.JobAdvertisementDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(), "Listed");
	}

	@Override
	public Result Add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Added");
	}

	@Override
	public Result Delete(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.delete(jobAdvertisement);
		return new SuccessResult("Deleted");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByReleaseDate(LocalDate releaseDate) {

		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByReleaseDate(releaseDate),
				"Listed");
	}

	@Override
	public DataResult<List<JobAdvertisementDto>> getJobAdvertisementWithDetails() {
		return new SuccessDataResult<List<JobAdvertisementDto>>(
				this.jobAdvertisementDao.getJobAdvertisementWithDetails(), "Lİsted");
	}

	// @Override
	// public DataResult<List<JobAdvertisement>> getByCompanyName(String
	// companyName) {
	// return new
	// SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByCompanyName(companyName));
	// }

}
