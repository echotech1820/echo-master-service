package com.echotech.master.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.echotech.master.model.Clinic;

@Repository
public interface ClinicRepository extends JpaRepository<Clinic, Integer> {

	@Query("SELECT e.clnName FROM Clinic e WHERE e.clnSysId = :sysId")
	String getClinNameById(@Param("sysId")Integer clinicId);

}
