package com.example.demo.entites;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Address {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Integer addressId;
    private String currentAddress;
    private String permanentAddress;
    private String residentialAddress;
//    @ManyToOne
//    private Address address;

}
