package com.studentTrans.StudentTrans.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentTrans.StudentTrans.Service.StudentService;
import com.studentTrans.StudentTrans.model.AccountTransferRestModel;
import com.studentTrans.StudentTrans.model.Payment;
import com.studentTrans.StudentTrans.model.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/retrieve")
	public List<Student> retrieve() {
		List<Student> studentList = studentService.retrieve();
		return studentList;
	}
	
	@PostMapping("/insert")
	public String insert(@RequestBody Student student) {
		if (student == null) {
			return "Failed to insert Student within the database";
		} else {
			String result = studentService.insert(student);
			return result;
		}
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int studentId) {
		String result = studentService.delete(studentId);
		return result;
	}
	
	@PostMapping("/transfer")
	public Payment TransferAccntToAccnt(@RequestBody AccountTransferRestModel restmodel ) {

		return studentService.transferMoney(restmodel.getSchoolAccNo(),
				restmodel.getStudentAccNO(),restmodel.getAmount(),restmodel.getStudentId());

		
	}

}
