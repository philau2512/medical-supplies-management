package com.medicalsuppliesmanagement.material.entity;

import com.medicalsuppliesmanagement.category.entity.Category;
import com.medicalsuppliesmanagement.customer.entity.Customer;
import com.medicalsuppliesmanagement.supplier.entity.Supplier;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "materials")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Material {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "material_code")
    private String materialCode;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    
    @Column(name = "img_url", columnDefinition = "TEXT")
    private String imgUrl;
    
    @Column(name = "price")
    private Double price;
    
    @Column(name = "quantity")
    private Integer quantity;
    
    @Column(name = "unit")
    private String unit;
    
    @Column(name = "expiration_date")
    private LocalDateTime expirationDate;
    
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
}
