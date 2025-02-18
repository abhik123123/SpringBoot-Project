package com.example.MyCart.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity  // Marks this class as a JPA entity (maps to a table)
@Table(name = "users")  // Specifies the table name in the database
@Data
@Setter
@Getter
@NoArgsConstructor  // Generates a no-argument constructor
@AllArgsConstructor  // Generates a constructor with all fields
@ToString  // Generates toString() method
public class User {

    @Id  // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment ID
    private Long userId;

    @Column(nullable = false, length = 100)
    private String userName;

    @Column(nullable = false, unique = true, length = 100)
    private String userEmail;

    @Column(nullable = false)
    private String userPassword;

    @Column(nullable = false, unique = true, length = 15)
    private String userPhone;

    private String userPicture;  // Store image URL or path

    @Column(length = 255)
    private String userAddress;
}
