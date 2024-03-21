package com.spring.Authentication.Repository;

import com.spring.Authentication.Model.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepo extends JpaRepository<Authentication,Integer> {
}
