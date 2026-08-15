package com.echotech.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.echotech.master.model.ClinicUserRole;

@Repository
public interface ClinicUserRolerepository extends JpaRepository<ClinicUserRole, Integer> {

}
