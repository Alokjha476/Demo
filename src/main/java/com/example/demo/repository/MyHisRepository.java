package com.example.demo.repository;

import com.example.demo.entites.MyHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyHisRepository extends JpaRepository<MyHistory,Integer> {

}
