package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.ExperienceInfo;

public interface ExperienceInfoDao extends JpaRepository<ExperienceInfo, Integer>{

}
