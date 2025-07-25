package com.medicalsuppliesmanagement.order.entity;

import com.medicalsuppliesmanagement.customer.entity.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "create_at")
    private LocalDateTime createAt;
    
    @Column(name = "order_code")
    private String orderCode;
    
    @Column(name = "total_amount")
    private Double totalAmount;
    
    @Column(name = "completed_at")
    private LocalDateTime completedAt;
    
    @Column(name = "discount_amount")
    private Double discountAmount;
    
    @Column(name = "discount_rate")
    private Integer discountRate;
    
    @Column(name = "discount_percent")
    private Double discountPercent;
    
    @Column(name = "note")
    private String note;
    
    @Column(name = "payment_method")
    private String paymentMethod;
    
    @Column(name = "payment_status")
    private String paymentStatus;
    
    @Column(name = "subtotal_amount")
    private Double subtotalAmount;
    
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    
    @Column(name = "vat_amount")
    private Double vatAmount;
    
    @Column(name = "vat_percent")
    private Double vatPercent;
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;
} 