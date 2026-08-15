package com.echotech.master.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clinic_user_role")
public class ClinicUserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clule_sys_id")
    private Integer cluleSysId;

    @Column(name = "clule_clur_sys_id", nullable = false)
    private Integer cluleClurSysId;

    @Column(name = "clule_role_sys_id", nullable = false)
    private Integer cluleRoleSysId;

    @Column(name = "clule_status", nullable = false)
    private String cluleStatus;

    @Column(name = "clule_created_at")
    private LocalDateTime cluleCreatedAt;

    @Column(name = "clule_created_by")
    private String cluleCreatedBy;

    @Column(name = "clule_updated_at")
    private LocalDateTime cluleUpdatedAt;

    @Column(name = "clule_updated_by")
    private String cluleUpdatedBy;

	public Integer getCluleSysId() {
		return cluleSysId;
	}

	public void setCluleSysId(Integer cluleSysId) {
		this.cluleSysId = cluleSysId;
	}

	public Integer getCluleClurSysId() {
		return cluleClurSysId;
	}

	public void setCluleClurSysId(Integer cluleClurSysId) {
		this.cluleClurSysId = cluleClurSysId;
	}

	public Integer getCluleRoleSysId() {
		return cluleRoleSysId;
	}

	public void setCluleRoleSysId(Integer cluleRoleSysId) {
		this.cluleRoleSysId = cluleRoleSysId;
	}

	public String getCluleStatus() {
		return cluleStatus;
	}

	public void setCluleStatus(String cluleStatus) {
		this.cluleStatus = cluleStatus;
	}

	public LocalDateTime getCluleCreatedAt() {
		return cluleCreatedAt;
	}

	public void setCluleCreatedAt(LocalDateTime cluleCreatedAt) {
		this.cluleCreatedAt = cluleCreatedAt;
	}

	public String getCluleCreatedBy() {
		return cluleCreatedBy;
	}

	public void setCluleCreatedBy(String cluleCreatedBy) {
		this.cluleCreatedBy = cluleCreatedBy;
	}

	public LocalDateTime getCluleUpdatedAt() {
		return cluleUpdatedAt;
	}

	public void setCluleUpdatedAt(LocalDateTime cluleUpdatedAt) {
		this.cluleUpdatedAt = cluleUpdatedAt;
	}

	public String getCluleUpdatedBy() {
		return cluleUpdatedBy;
	}

	public void setCluleUpdatedBy(String cluleUpdatedBy) {
		this.cluleUpdatedBy = cluleUpdatedBy;
	}
    
}
