package com.loan.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.demo.entity.transcation;

@Repository
public interface transcationrepository extends JpaRepository<transcation, Long> {

	List<transcation> findbuloanid(Long longid);

}
