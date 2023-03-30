package zohoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zohoapp.entity.Detail;
import zohoapp.repository.DetailRepository;
@Service
public class DetailServiceImpl implements DetailService {
	
	@Autowired
	private DetailRepository detailRepo;

	@Override
	public void save(Detail detail) {
		detailRepo.save(detail);

	}

}
