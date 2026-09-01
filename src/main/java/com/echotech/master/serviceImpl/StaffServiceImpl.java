package com.echotech.master.serviceImpl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.echotech.master.dto.StaffRequestDto;
import com.echotech.master.dto.StaffSetupResponse;
import com.echotech.master.exception.BadRequestException;
import com.echotech.master.model.ClinicUser;
import com.echotech.master.model.ClinicUserRole;
import com.echotech.master.model.Role;
import com.echotech.master.model.Staff;
import com.echotech.master.repository.ClinicUserRepository;
import com.echotech.master.repository.ClinicUserRolerepository;
import com.echotech.master.repository.RoleRepository;
import com.echotech.master.repository.StaffRepository;
import com.echotech.master.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService {
	
	@Autowired
	private StaffRepository staffRepo;
	
	@Autowired
	private ClinicUserRepository clinicUserRepo;
	
	@Autowired
	private ClinicUserRolerepository clnUserRoleRepo;
	
	@Autowired
	private RoleRepository roleRepo;

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
			
			ClinicUser clinicUser = new ClinicUser();
			
			clinicUser.setClurClnSysId(staffRequest.getClinicSysId());
			clinicUser.setClurUserSysId(staffRequest.getStaffUserSysId());
			clinicUser.setClurStatus("Y");
			clinicUser.setClurCreatedAt(LocalDateTime.now());
			
			clinicUser = clinicUserRepo.save(clinicUser);
			
			Optional<Role> optRole = roleRepo.findByRoleCode("STF");
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
			response.setStatusMessage("STAFF SETUP SUCCESSFUL");
			response.setUniqueId(staff.getStaffSysId());
			return response;
		} else {
			throw new BadRequestException("THE GIVEN REQUEST IS INVALID");
		}
	}

}
