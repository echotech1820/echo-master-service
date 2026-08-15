package com.echotech.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.echotech.master.model.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {

}
