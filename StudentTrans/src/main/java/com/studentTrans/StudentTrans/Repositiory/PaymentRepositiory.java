package com.studentTrans.StudentTrans.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentTrans.StudentTrans.model.Payment;

public interface PaymentRepositiory extends JpaRepository<Payment, Integer>{

}
