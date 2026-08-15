package com.echotech.master.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.echotech.master.dto.DoctorRequestDto;
import com.echotech.master.dto.DoctorSetupResponse;
import com.echotech.master.service.DoctorService;

@RestController
@RequestMapping("/api/v1/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/acnt-setup")
	public ResponseEntity<DoctorSetupResponse> doctorSetup(@RequestBody DoctorRequestDto docRequest){
		
		DoctorSetupResponse response = doctorService.doctorSetup(docRequest);
		
		return ResponseEntity.ok(response);
		
	}

}
