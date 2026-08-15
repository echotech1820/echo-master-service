package com.echotech.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.echotech.master.model.ClinicUser;

@Repository
public interface ClinicUserRepository extends JpaRepository<ClinicUser, Integer> {

}
