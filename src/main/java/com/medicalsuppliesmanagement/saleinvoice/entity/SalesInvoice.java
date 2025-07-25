package com.medicalsuppliesmanagement.saleinvoice.entity;

import com.medicalsuppliesmanagement.customer.entity.Customer;
import com.medicalsuppliesmanagement.employee.entity.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "sales_invoices")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SalesInvoice {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "invoice_code")
    private String invoiceCode;
    
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    @Column(name = "total_amount")
    private Double totalAmount;
    
    @Column(name = "discount_amount")
    private Double discountAmount;
    
    @Column(name = "vat_amount")
    private Double vatAmount;
    
    @Column(name = "note", columnDefinition = "TEXT")
    private String note;
    
    @OneToMany(mappedBy = "salesInvoice", cascade = CascadeType.ALL)
    private List<SalesInvoiceItem> salesInvoiceItems;
}
