package com.medicalsuppliesmanagement.returnmaterials.entity;

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
@Table(name = "return_documents")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReturnDocument {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
    
    @OneToMany(mappedBy = "returnDocument", cascade = CascadeType.ALL)
    private List<ReturnItem> returnItems;
}
