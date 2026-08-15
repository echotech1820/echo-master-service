package com.echotech.master.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.echotech.master.dto.ClinicRequestDto;
import com.echotech.master.dto.ClinicSetupResponse;
import com.echotech.master.service.ClinicService;

@RestController
@RequestMapping("/api/v1/clinic")
public class ClinicController {
	
	@Autowired
	private ClinicService clinicService;
	
	@PostMapping("/acnt-setup")
	public ResponseEntity<ClinicSetupResponse> clinicSetup(@RequestBody ClinicRequestDto clinicRequest){
		
		ClinicSetupResponse response = clinicService.clinicSetup(clinicRequest);
		
		return ResponseEntity.ok(response);
		
	}

}
