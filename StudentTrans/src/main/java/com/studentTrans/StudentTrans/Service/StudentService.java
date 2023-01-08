package com.studentTrans.StudentTrans.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.studentTrans.StudentTrans.Repositiory.PaymentRepositiory;
import com.studentTrans.StudentTrans.Repositiory.StudentRepository;
import com.studentTrans.StudentTrans.model.Payment;
import com.studentTrans.StudentTrans.model.Student;



@Service
@Transactional
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	PaymentRepositiory prepo;


	@Transactional
	// A Proxy is Created that wraps the function retrieve
	// BeginTransaction
	public List<Student> retrieve() {
		List<Student> studentList = (List<Student>) studentRepository.findAll();
		return studentList;
	}
	// Commit Transaction

	@Transactional
	// A Proxy is Created that wraps the function insert
	// BeginTransaction
	public String insert(Student student) {
		Student save = studentRepository.save(student); // Call to the Repository
		if (save.getStudentId() == 2) {
			int a = 1 / 0;
			System.out.println("The value of A is : " + a);
		}
		if (save != null) {
			return "The Student is successfully inserted within the database";
		}
		return "Failed to insert Student within the database";
	}
	// Commit Transaction

	@Transactional
	// A Proxy is Created that wraps the function delete
	// BeginTransaction
	public String delete(int StudentId) {
		studentRepository.deleteById(StudentId);
		return "The Student is successfully deleted from the database";
	}
	// Commit Transaction
	
	
	public Optional<Student> getAccount(int studentid) {
		return studentRepository.findById(studentid);
	}
	
	public Payment transferMoney(Long from, Long to, int amount,int studid) {
		
		return deposit(to, amount,studid);		
	}
	
	private Payment deposit(Long to, int amount,int studid) {
		Student studdetails = getAccount(studid).get();
		Payment model = new Payment();
		model.setStudentid(studid);
		model.setStudentname(studdetails.getStudentName());
		model.setAmount(amount);
		model.setLastoperation("Credited");
		prepo.save(model);

		if (amount < 0 || amount!=2000) // deposit value is negative
		{
			throw new RuntimeException(
					"Error: Deposit amount is invalid." + studdetails.getAccountno() + " " + amount);

		} else {			
			return model;
		}
	}
	
	
	


}
