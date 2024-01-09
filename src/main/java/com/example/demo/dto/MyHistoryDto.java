package com.example.demo.dto;

import com.example.demo.entites.Address;
import com.example.demo.entites.MyHistory;
import lombok.Data;

@Data
public class MyHistoryDto {
    private Integer id;
    private String myName;
    private Address myAddress;
    private String myNumber;
    private MyHistoryDto myHistoryDto;
}
