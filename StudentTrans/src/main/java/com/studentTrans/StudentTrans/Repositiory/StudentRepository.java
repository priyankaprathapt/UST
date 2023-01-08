package com.studentTrans.StudentTrans.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentTrans.StudentTrans.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
