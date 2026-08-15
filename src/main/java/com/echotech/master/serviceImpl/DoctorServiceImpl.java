package com.echotech.master.serviceImpl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.echotech.master.dto.DoctorRequestDto;
import com.echotech.master.dto.DoctorSetupResponse;
import com.echotech.master.exception.BadRequestException;
import com.echotech.master.model.Doctor;
import com.echotech.master.repository.DoctorRepository;
import com.echotech.master.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorRepository docRepo;

	@Override
	public DoctorSetupResponse doctorSetup(DoctorRequestDto docRequest) {
		DoctorSetupResponse response = new DoctorSetupResponse();
		
		if(docRequest != null) {
		Doctor doctor = new Doctor();
		
		doctor.setDocFullName(docRequest.getDocFullName());
		doctor.setDocQualifn(docRequest.getDocQualifn());
		doctor.setDocSpecialn(docRequest.getDocSpecialn());
		doctor.setDocRegnNumber(docRequest.getDocRegnNumber());
		doctor.setDocUserSysId(docRequest.getDocUserSysId());
		doctor.setDocCreatedAt(LocalDateTime.now());
		
		doctor = docRepo.save(doctor);
		
		response.setStatusCode("SUCCESS");
		response.setStatusMessage("DOCTOR SETUP SUCCESSFUL");
		response.setUniqueId(doctor.getDocSysId());
		return response;
		}else {
			throw new BadRequestException("THE GIVEN REQUEST IS INVALID");
		}
		
	}

}
