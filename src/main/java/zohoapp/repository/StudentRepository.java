package zohoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import zohoapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	

}
