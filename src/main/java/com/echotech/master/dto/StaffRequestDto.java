package com.echotech.master.dto;

public class StaffRequestDto {

    private Integer staffUserSysId;

    private String staffFullName;

    private String staffRole;

    private String staffActiveFlag;
    
    private Integer clinicSysId;

	public Integer getStaffUserSysId() {
		return staffUserSysId;
	}

	public void setStaffUserSysId(Integer staffUserSysId) {
		this.staffUserSysId = staffUserSysId;
	}

	public String getStaffFullName() {
		return staffFullName;
	}

	public void setStaffFullName(String staffFullName) {
		this.staffFullName = staffFullName;
	}

	public String getStaffRole() {
		return staffRole;
	}

	public void setStaffRole(String staffRole) {
		this.staffRole = staffRole;
	}

	public String getStaffActiveFlag() {
		return staffActiveFlag;
	}

	public void setStaffActiveFlag(String staffActiveFlag) {
		this.staffActiveFlag = staffActiveFlag;
	}

	public Integer getClinicSysId() {
		return clinicSysId;
	}

	public void setClinicSysId(Integer clinicSysId) {
		this.clinicSysId = clinicSysId;
	}

}
