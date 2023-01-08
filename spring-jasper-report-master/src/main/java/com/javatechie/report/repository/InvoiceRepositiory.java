package com.javatechie.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.report.entity.Invoice;

public interface InvoiceRepositiory extends JpaRepository<Invoice, Integer>{

}
