package com.echotech.master.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_sys_id")
    private Integer roleSysId;

    @Column(name = "role_code")
    private String roleCode;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_description")
    private String roleDescription;

    @Column(name = "role_status", nullable = false)
    private String roleStatus;

    @Column(name = "role_created_at")
    private LocalDateTime roleCreatedAt;

    @Column(name = "role_created_by")
    private String roleCreatedBy;

    @Column(name = "role_updated_at")
    private LocalDateTime roleUpdatedAt;

    @Column(name = "role_updated_by")
    private String roleUpdatedBy;

	public Integer getRoleSysId() {
		return roleSysId;
	}

	public void setRoleSysId(Integer roleSysId) {
		this.roleSysId = roleSysId;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public String getRoleStatus() {
		return roleStatus;
	}

	public void setRoleStatus(String roleStatus) {
		this.roleStatus = roleStatus;
	}

	public LocalDateTime getRoleCreatedAt() {
		return roleCreatedAt;
	}

	public void setRoleCreatedAt(LocalDateTime roleCreatedAt) {
		this.roleCreatedAt = roleCreatedAt;
	}

	public String getRoleCreatedBy() {
		return roleCreatedBy;
	}

	public void setRoleCreatedBy(String roleCreatedBy) {
		this.roleCreatedBy = roleCreatedBy;
	}

	public LocalDateTime getRoleUpdatedAt() {
		return roleUpdatedAt;
	}

	public void setRoleUpdatedAt(LocalDateTime roleUpdatedAt) {
		this.roleUpdatedAt = roleUpdatedAt;
	}

	public String getRoleUpdatedBy() {
		return roleUpdatedBy;
	}

	public void setRoleUpdatedBy(String roleUpdatedBy) {
		this.roleUpdatedBy = roleUpdatedBy;
	}
    
}