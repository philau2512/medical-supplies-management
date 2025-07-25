// Hóa đơn nhập kho
package com.medicalsuppliesmanagement.importinvoice.entity;

import com.medicalsuppliesmanagement.employee.entity.Employee;
import com.medicalsuppliesmanagement.supplier.entity.Supplier;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "import_invoices")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImportInvoice {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "invoice_code")
    private String invoiceCode;
    
    @Column(name = "create_at")
    private LocalDateTime createAt;
    
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
    
    @ManyToOne
    @JoinColumn(name = "created_by")
    private Employee createdBy;
    
    @OneToMany(mappedBy = "importInvoice", cascade = CascadeType.ALL)
    private List<ImportInvoiceItem> importInvoiceItems;
}
