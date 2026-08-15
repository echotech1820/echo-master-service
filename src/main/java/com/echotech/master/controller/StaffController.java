package com.echotech.master.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.echotech.master.dto.StaffRequestDto;
import com.echotech.master.dto.StaffSetupResponse;
import com.echotech.master.service.StaffService;

@RestController
@RequestMapping("/api/v1/staff")
public class StaffController {
	
	@Autowired
	private StaffService staffService;
	
	@PostMapping("/acnt-setup")
	public ResponseEntity<StaffSetupResponse> staffSetup(@RequestBody StaffRequestDto staffRequest){
		
		StaffSetupResponse response = staffService.staffSetup(staffRequest);
		
		return ResponseEntity.ok(response);
		
	}

}
