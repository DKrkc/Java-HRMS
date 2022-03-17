package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobSeekerService;
import kodlamaio.Hrms.business.abstracts.MernisService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.ErrorResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.Hrms.entities.concretes.JobSeeker;
@Service
public class JobSeekerManager implements JobSeekerService {
	private JobSeekerDao jobSeekerDao;
	private MernisService mernisService;

	@Autowired
	
	public JobSeekerManager(JobSeekerDao jobSeekerDao, MernisService mernisService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.mernisService = mernisService;
	}


	@Override
	public DataResult< List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"Listed");
	}

	@Override
	public Result Add(JobSeeker jobSeeker) {
		
		Result result=checkIfRealPersonResult(jobSeeker);

		if(result != null) {
			return result;
	}
		
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Added");
		
		
		
	}
	
	private Result checkIfRealPersonResult(JobSeeker jobSeeker) {
		if(mernisService.checkIfRealPeerson(jobSeeker)) {
			this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult();
		}else {
			return new ErrorResult();
		}
	}

	@Override
	public Result Delete(JobSeeker jobSeeker) {
		this.jobSeekerDao.delete(jobSeeker);
		return new SuccessResult("Deleted");
	}

}
