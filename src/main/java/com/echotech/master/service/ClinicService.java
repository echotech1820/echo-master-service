package com.echotech.master.service;

import com.echotech.master.dto.ClinicRequestDto;
import com.echotech.master.dto.ClinicSetupResponse;

public interface ClinicService {

	ClinicSetupResponse clinicSetup(ClinicRequestDto clinicRequest);

}
