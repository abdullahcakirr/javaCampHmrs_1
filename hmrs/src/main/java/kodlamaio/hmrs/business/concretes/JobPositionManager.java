package kodlamaio.hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hmrs.business.abstracts.JobPositionService;
import kodlamaio.hmrs.dataAccsess.abstracts.JobPositionDao;
import kodlamaio.hmrs.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	
	@Autowired
	private JobPositionDao jobPosition;
	
	@Autowired
	public JobPositionManager() {
	}
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPosition) {
		super();
		this.jobPosition = jobPosition;
	}


	@Override
	public List<JobPosition> getAll() {
		return this.jobPosition.findAll();
	}

}
