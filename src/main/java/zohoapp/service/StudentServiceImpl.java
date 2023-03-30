package zohoapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zohoapp.entity.Student;
import zohoapp.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studRepo;

	@Override
	public void save(Student student) {
		studRepo.save(student);
	}

	@Override
	public Student getOneLead(long id) {
		Optional<Student> findById = studRepo.findById(id);
		Student student = findById.get();
		return student;
	}

	@Override
	public void deleteLeadById(long id) {
		studRepo.deleteById(id);
		
	}

	@Override
	public List<Student> getallStudents() {
		List<Student> students = studRepo.findAll();
		return students;
	}
	

}
