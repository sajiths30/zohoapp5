package zohoapp.service;

import java.util.List;

import zohoapp.entity.Student;

public interface StudentService {

	public void save(Student student);

	public Student getOneLead(long id);

	public void deleteLeadById(long id);

	public List<Student> getallStudents();
	 
}
