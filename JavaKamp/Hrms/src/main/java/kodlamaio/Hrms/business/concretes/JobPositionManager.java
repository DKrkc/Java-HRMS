package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobPositionService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.Hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jopPositionDao;

	@Autowired
	public JobPositionManager(JobPositionDao jopPositionDao) {
		super();
		this.jopPositionDao = jopPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jopPositionDao.findAll(),"Listed");
	}

	@Override
	public Result Add(JobPosition jobPosition) {
	this.jopPositionDao.save(jobPosition);
	return new SuccessResult("Added");
	}

	@Override
	public Result Delete(JobPosition jobPosition) {
	this.jopPositionDao.delete(jobPosition);
	return new SuccessResult("Deleted");
	}

}
