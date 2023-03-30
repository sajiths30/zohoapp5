package zohoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import zohoapp.entity.Batch;

public interface BatchRepository extends JpaRepository<Batch, Long> {

}
