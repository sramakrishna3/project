package com.loan.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.demo.entity.Loan;

@Repository
public interface Loanrespository  extends JpaRepository<Loan, Long>{

	List<Loan> findByCustomer_custid(Long customerId);
}
