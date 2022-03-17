package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.EducationInfo;

public interface EducationInfoService {
	//DataResult <EducationInfo > getByUserIdOrderBySchoolEndDate(int userId);
	Result Add(EducationInfo educationInfo);

}
