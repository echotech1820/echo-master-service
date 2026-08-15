package com.echotech.master.service;

import com.echotech.master.dto.StaffRequestDto;
import com.echotech.master.dto.StaffSetupResponse;

public interface StaffService {

	StaffSetupResponse staffSetup(StaffRequestDto staffRequest);

}
