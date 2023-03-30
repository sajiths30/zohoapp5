package zohoapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zohoapp.entity.Student;
import zohoapp.repository.StudentRepository;

@RestController
@RequestMapping("/api/students")
public class StudentRestController {
	
	@Autowired
	private StudentRepository studRepo;

	@GetMapping()
	public List<Student> getStudent() {
		List<Student> students = studRepo.findAll();
		return students;
	}
	@GetMapping("/find/{id}")
	public Student getOneStudent(@PathVariable("id")long id) {
		Optional<Student> findById = studRepo.findById(id);
		Student student = findById.get();
		return student; 
	}
	@PostMapping()
	public void postStudent(@RequestBody Student student) {
		studRepo.save(student);
	}
	@PutMapping()
	public void updateStudent(@RequestBody Student student) {
		studRepo.save(student);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable("id")long id) {
		studRepo.deleteById(id);
	}
}
