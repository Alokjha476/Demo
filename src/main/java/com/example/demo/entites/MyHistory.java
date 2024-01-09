package com.example.demo.entites;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Entity
@Data
public class MyHistory {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    private String myName;
//    @OneToMany
//    private Address address;
    private String myNumber;
}
