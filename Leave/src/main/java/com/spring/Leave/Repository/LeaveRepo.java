package com.spring.Leave.Repository;

import com.spring.Leave.Mode.Leave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveRepo extends JpaRepository<Leave,Integer> {
}
