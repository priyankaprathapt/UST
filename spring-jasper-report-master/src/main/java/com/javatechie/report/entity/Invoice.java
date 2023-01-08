package com.javatechie.report.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name = "invoice")
public class Invoice {

	@Id
    private int id;
    private String companyname;
    private String companyaddress;
    private String invoicedate;
    private String invoiceno;
    private String billto;
    private String shipto;
}
