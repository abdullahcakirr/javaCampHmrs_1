package kodlamaio.hmrs.dataAccsess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hmrs.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {
	
}
