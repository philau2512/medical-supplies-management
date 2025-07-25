package com.medicalsuppliesmanagement.importinvoice.entity;

// Chi tiết hóa đơn nhập kho
import com.medicalsuppliesmanagement.material.entity.Material;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "import_invoice_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImportInvoiceItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private ImportInvoice importInvoice;
    
    @ManyToOne
    @JoinColumn(name = "material_id")
    private Material material;
    
    @Column(name = "quantity")
    private Integer quantity;
    
    @Column(name = "unit_price")
    private Double unitPrice;
    
    @Column(name = "total_price")
    private Double totalPrice;
    
    @Column(name = "note", columnDefinition = "TEXT")
    private String note;
}
