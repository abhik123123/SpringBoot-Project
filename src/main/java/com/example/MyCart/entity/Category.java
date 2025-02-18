package com.example.MyCart.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categories")
@Getter  // ✅ Lombok: Generates getter methods
@Setter  // ✅ Lombok: Generates setter methods
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Column(nullable = false, length = 100)
    private String categoryTitle;

    @Column(length = 255)
    private String categoryDescription;
}
