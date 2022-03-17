package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.entities.concretes.JobSeeker;

public interface MernisService {
	Boolean checkIfRealPeerson(JobSeeker jobSeeker);

}
