package zohoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import zohoapp.entity.Batch;
import zohoapp.entity.Student;
import zohoapp.repository.StudentRepository;
import zohoapp.service.BatchService;
import zohoapp.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studService;
	
	@Autowired
	private BatchService batchService;

	@RequestMapping("/create")
	public String createStudentForm() {
		return "create_Student";
	}
	@RequestMapping("/saveStudent")
	public String saveStudents(@ModelAttribute("student")Student student,Model model) {
		studService.save(student);
		model.addAttribute("msg", "data is saved");
		return "student_info";
	}
	@RequestMapping("/convertStudent")
	public String convertStudent(@RequestParam("id")long id,Model model) {
		Student student = studService.getOneLead(id);
		Batch batch= new Batch();
		batch.setFirstName(student.getFirstName());
		batch.setLastName(student.getLastName());
		batch.setEmail(student.getEmail());
		batch.setMobile(student.getMobile());
		batch.setCource(student.getCource());
		batchService.save(batch);
		studService.deleteLeadById(id);
		return "list_batch";
	}
	@RequestMapping("/listStudents")
	public String getAllStudents(Model model) {
		List<Student> students = studService.getallStudents();
		model.addAttribute("students", students);
		return "list_students";
	}
	@RequestMapping("/studentInfo")
	public String studentInfo(@RequestParam("id")long id,Model model) {
		Student student = studService.getOneLead(id);
		model.addAttribute("student", student);
		return "student_info";
	}
	
	
}
