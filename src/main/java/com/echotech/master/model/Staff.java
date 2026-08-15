package com.echotech.master.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "staff_master")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_sys_id")
    private Integer staffSysId;

    @Column(name = "staff_user_sys_id")
    private Integer staffUserSysId;

    @Column(name = "staff_full_name")
    private String staffFullName;

    @Column(name = "staff_role")
    private String staffRole;

    @Column(name = "staff_active_flag")
    private String staffActiveFlag;

    @Column(name = "staff_created_at")
    private LocalDateTime staffCreatedAt;

    @Column(name = "staff_created_by")
    private String staffCreatedBy;

    @Column(name = "staff_updated_at")
    private LocalDateTime staffUpdatedAt;

    @Column(name = "staff_updated_by")
    private String staffUpdatedBy;

	public Integer getStaffSysId() {
		return staffSysId;
	}

	public void setStaffSysId(Integer staffSysId) {
		this.staffSysId = staffSysId;
	}

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

	public LocalDateTime getStaffCreatedAt() {
		return staffCreatedAt;
	}

	public void setStaffCreatedAt(LocalDateTime staffCreatedAt) {
		this.staffCreatedAt = staffCreatedAt;
	}

	public String getStaffCreatedBy() {
		return staffCreatedBy;
	}

	public void setStaffCreatedBy(String staffCreatedBy) {
		this.staffCreatedBy = staffCreatedBy;
	}

	public LocalDateTime getStaffUpdatedAt() {
		return staffUpdatedAt;
	}

	public void setStaffUpdatedAt(LocalDateTime staffUpdatedAt) {
		this.staffUpdatedAt = staffUpdatedAt;
	}

	public String getStaffUpdatedBy() {
		return staffUpdatedBy;
	}

	public void setStaffUpdatedBy(String staffUpdatedBy) {
		this.staffUpdatedBy = staffUpdatedBy;
	}

}
