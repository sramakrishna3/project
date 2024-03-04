package com.loan.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.demo.entity.loan;

@Repository
public interface loanrespository  extends JpaRepository<loan, Long>{

	List<loan> findbycustomerid(Long customerId);
}
