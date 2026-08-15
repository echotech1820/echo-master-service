package com.echotech.master.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clinic_user")
public class ClinicUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clur_sys_id")
    private Integer clurSysId;

    @Column(name = "clur_cln_sys_id", nullable = false)
    private Integer clurClnSysId;

    @Column(name = "clur_user_sys_id", nullable = false)
    private Integer clurUserSysId;

    @Column(name = "clur_is_primary")
    private String clurIsPrimary;

    @Column(name = "clur_status")
    private String clurStatus;

    @Column(name = "clur_assoc_tpe")
    private String clurAssocTpe;

    @Column(name = "clur_created_at")
    private LocalDateTime clurCreatedAt;

    @Column(name = "clur_created_by")
    private String clurCreatedBy;

    @Column(name = "clur_updated_at")
    private LocalDateTime clurUpdatedAt;

    @Column(name = "clur_updated_by")
    private String clurUpdatedBy;

	public Integer getClurSysId() {
		return clurSysId;
	}

	public void setClurSysId(Integer clurSysId) {
		this.clurSysId = clurSysId;
	}

	public Integer getClurClnSysId() {
		return clurClnSysId;
	}

	public void setClurClnSysId(Integer clurClnSysId) {
		this.clurClnSysId = clurClnSysId;
	}

	public Integer getClurUserSysId() {
		return clurUserSysId;
	}

	public void setClurUserSysId(Integer clurUserSysId) {
		this.clurUserSysId = clurUserSysId;
	}

	public String getClurIsPrimary() {
		return clurIsPrimary;
	}

	public void setClurIsPrimary(String clurIsPrimary) {
		this.clurIsPrimary = clurIsPrimary;
	}

	public String getClurStatus() {
		return clurStatus;
	}

	public void setClurStatus(String clurStatus) {
		this.clurStatus = clurStatus;
	}

	public String getClurAssocTpe() {
		return clurAssocTpe;
	}

	public void setClurAssocTpe(String clurAssocTpe) {
		this.clurAssocTpe = clurAssocTpe;
	}

	public LocalDateTime getClurCreatedAt() {
		return clurCreatedAt;
	}

	public void setClurCreatedAt(LocalDateTime clurCreatedAt) {
		this.clurCreatedAt = clurCreatedAt;
	}

	public String getClurCreatedBy() {
		return clurCreatedBy;
	}

	public void setClurCreatedBy(String clurCreatedBy) {
		this.clurCreatedBy = clurCreatedBy;
	}

	public LocalDateTime getClurUpdatedAt() {
		return clurUpdatedAt;
	}

	public void setClurUpdatedAt(LocalDateTime clurUpdatedAt) {
		this.clurUpdatedAt = clurUpdatedAt;
	}

	public String getClurUpdatedBy() {
		return clurUpdatedBy;
	}

	public void setClurUpdatedBy(String clurUpdatedBy) {
		this.clurUpdatedBy = clurUpdatedBy;
	}
    
}
