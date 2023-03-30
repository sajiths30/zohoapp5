package zohoapp.service;

import java.util.List;

import zohoapp.entity.Batch;

public interface BatchService {

	public void save(Batch batch);

	public List<Batch> getAllBatches();

	public Batch getOneBatch(long id);
    
}
