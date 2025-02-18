package com.example.MyCart.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity  // Marks this class as a JPA entity (maps to a table)
@Table(name = "products")  // Specifies the table name in the database
@Data
@NoArgsConstructor  // Generates a no-argument constructor
@AllArgsConstructor  // Generates a constructor with all fields
@ToString  // Generates toString() method
public class Products {

    @Id  // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment ID
    private Long ppid;

    @Column(nullable = false, length = 100)
    private String ptitle;

    @Column(length = 255)
    private String pdesc;

    private String pphoto;  // Store image URL or path

    @Column(nullable = false)
    private double pprice;

    private double pdiscount;  // Discount percentage

    @Column(nullable = false)
    private int pquantity;

    // Many-to-One relationship with Category
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
