package com.echotech.master.serviceImpl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.echotech.master.dto.ClinicRequestDto;
import com.echotech.master.dto.ClinicSetupResponse;
import com.echotech.master.exception.BadRequestException;
import com.echotech.master.model.Clinic;
import com.echotech.master.model.ClinicUser;
import com.echotech.master.model.ClinicUserRole;
import com.echotech.master.model.Role;
import com.echotech.master.repository.ClinicRepository;
import com.echotech.master.repository.ClinicUserRepository;
import com.echotech.master.repository.ClinicUserRolerepository;
import com.echotech.master.repository.RoleRepository;
import com.echotech.master.service.ClinicService;

@Service
public class ClinicServiceImpl implements ClinicService {
	
	@Autowired
	private ClinicRepository clinicRepo;
	
	@Autowired
	private ClinicUserRepository clinicUserRepo;
	
	@Autowired
	private RoleRepository roleRepo;
	
	@Autowired
	private ClinicUserRolerepository clnUserRoleRepo;

	@Override
	public ClinicSetupResponse clinicSetup(ClinicRequestDto clinicRequest) {
		ClinicSetupResponse response = new ClinicSetupResponse();
		
		if(clinicRequest != null) {
			Clinic clinic = new Clinic();
			
			clinic.setClnName(clinicRequest.getClnName());
			clinic.setClnPhoneNumber(clinicRequest.getClnPhoneNumber());
			clinic.setClnAddressLine1(clinicRequest.getClnAddressLine1());
			clinic.setClnArea(clinicRequest.getClnArea());
			clinic.setClnCity(clinicRequest.getClnCity());
			clinic.setClnCreatedAt(LocalDateTime.now());
			
			/** New Clinic Creation ends here 
			 * After Clinic Clinic User should be created.
			 * After Clinic User Clinic User Role Mapping should be created.*/
			clinic = clinicRepo.save(clinic);
			
			ClinicUser clinicUser = new ClinicUser();
			
			clinicUser.setClurClnSysId(clinic.getClnSysId());
			clinicUser.setClurUserSysId(clinicRequest.getUserId());
			clinicUser.setClurStatus("Y");
			clinicUser.setClurCreatedAt(LocalDateTime.now());
			
			clinicUser = clinicUserRepo.save(clinicUser);
			
			Optional<Role> optRole = roleRepo.findByRoleCode(clinicRequest.getRoleCode());
			Role role = new Role();
			if(!optRole.isEmpty()) {
				role = optRole.get();
			}
			
			ClinicUserRole clnUserRole = new ClinicUserRole();
			
			clnUserRole.setCluleClurSysId(clinicUser.getClurSysId());
			clnUserRole.setCluleCreatedAt(LocalDateTime.now());
			clnUserRole.setCluleStatus("Y");
			clnUserRole.setCluleRoleSysId(role.getRoleSysId());
			
			clnUserRole = clnUserRoleRepo.save(clnUserRole);
			
			response.setStatusCode("SUCCESS");
			response.setStatusMessage("CLINIC SETUP SUCCESSFUL");
			response.setUniqueId(clinic.getClnSysId());
			
			return response;
		}else {
			throw new BadRequestException("THE GIVEN REQUEST IS INVALID");
		}
		
	}

}
