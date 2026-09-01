package com.echotech.master.service;

import com.echotech.master.dto.ClinicRequestDto;
import com.echotech.master.dto.ClinicSetupResponse;
import com.echotech.master.dto.ResponseDto;

public interface ClinicService {

	ClinicSetupResponse clinicSetup(ClinicRequestDto clinicRequest);

	ResponseDto getClinicName(Integer clinicId);

}
