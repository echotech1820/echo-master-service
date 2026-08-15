package com.echotech.master.service;

import com.echotech.master.dto.DoctorRequestDto;
import com.echotech.master.dto.DoctorSetupResponse;

public interface DoctorService {

	DoctorSetupResponse doctorSetup(DoctorRequestDto docRequest);

}
