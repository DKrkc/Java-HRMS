package kodlamaio.Hrms.business.concretes;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.EducationInfoService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.EducationInfoDao;
import kodlamaio.Hrms.entities.concretes.EducationInfo;

@Service
public class EducationInfoManager implements EducationInfoService {

	private EducationInfoDao educationInfoDao;

	@Autowired
	public EducationInfoManager(EducationInfoDao educationInfoDao) {
		super();
		this.educationInfoDao = educationInfoDao;
	}

//	@Override
//	public DataResult<EducationInfo> getByUserIdOrderBySchoolEndDate(int userId) {
//		
//		 return new SuccessDataResult<EducationInfo>(this.educationInfoDao.getByUserIdOrderBySchoolEndDate(userId));
//	}

	@Override
	public Result Add(EducationInfo educationInfo) {
		return null;
	}

}
