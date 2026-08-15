package com.echotech.master.serviceImpl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.echotech.master.dto.StaffRequestDto;
import com.echotech.master.dto.StaffSetupResponse;
import com.echotech.master.exception.BadRequestException;
import com.echotech.master.model.Staff;
import com.echotech.master.repository.StaffRepository;
import com.echotech.master.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService {
	
	@Autowired
	private StaffRepository staffRepo;

	@Override
	public StaffSetupResponse staffSetup(StaffRequestDto staffRequest) {
		StaffSetupResponse response = new StaffSetupResponse();

		if (staffRequest != null) {
			Staff staff = new Staff();

			staff.setStaffFullName(staffRequest.getStaffFullName());
			staff.setStaffRole(staffRequest.getStaffRole());
			staff.setStaffUserSysId(staffRequest.getStaffUserSysId());
			staff.setStaffCreatedAt(LocalDateTime.now());
			
			staff = staffRepo.save(staff);
			
			response.setStatusCode("SUCCESS");
			response.setStatusMessage("STAFF SETUP SUCCESSFUL");
			response.setUniqueId(staff.getStaffSysId());
			return response;
		} else {
			throw new BadRequestException("THE GIVEN REQUEST IS INVALID");
		}
	}

}
