package zohoapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zohoapp.entity.Batch;
import zohoapp.repository.BatchRepository;

@Service
public class BatchServiceImpl implements BatchService {
	
	@Autowired
	private BatchRepository batchRepo;

	@Override
	public void save(Batch batch) {
		batchRepo.save(batch);
		
	}

	@Override
	public List<Batch> getAllBatches() {
		List<Batch> batches = batchRepo.findAll();
		return batches;
	}

	@Override
	public Batch getOneBatch(long id) {
		Optional<Batch> findById = batchRepo.findById(id);
		Batch batch = findById.get();
		return batch;
	}

}
