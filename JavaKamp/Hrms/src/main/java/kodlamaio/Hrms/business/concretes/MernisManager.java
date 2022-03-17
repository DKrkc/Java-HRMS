package kodlamaio.Hrms.business.concretes;

import java.rmi.RemoteException;

import kodlamaio.Hrms.business.abstracts.MernisService;



import kodlamaio.Hrms.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManager implements MernisService {

	@Override
	public Boolean checkIfRealPeerson(JobSeeker jobSeeker) {
KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
try {
	return  kpsPublicSoapProxy .TCKimlikNoDogrula(Long.parseLong(jobSeeker.getNationalityId()), jobSeeker.getFirstName().toUpperCase(), jobSeeker.getLastName().toUpperCase(), Integer.parseInt(jobSeeker.getBirthOfDate()));
} catch (RemoteException e) {
	
	e.printStackTrace();
}
return true;
		
	}

}
