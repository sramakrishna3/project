package com.loan.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.demo.entity.Transcation;

@Repository
public interface Transcationrepository extends JpaRepository<Transcation, Long> {
}
