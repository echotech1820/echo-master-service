package com.echotech.master.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clinic_master")
public class Clinic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cln_sys_id")
    private Integer clnSysId;

    @Column(name = "cln_name")
    private String clnName;

    @Column(name = "cln_phone_number")
    private String clnPhoneNumber;

    @Column(name = "cln_tel_number")
    private String clnTelNumber;

    @Column(name = "cln_address_line1")
    private String clnAddressLine1;

    @Column(name = "cln_address_line2")
    private String clnAddressLine2;

    @Column(name = "cln_address_line3")
    private String clnAddressLine3;

    @Column(name = "cln_area")
    private String clnArea;

    @Column(name = "cln_city")
    private String clnCity;

    @Column(name = "cln_state")
    private String clnState;

    @Column(name = "cln_pincode")
    private String clnPincode;

    @Column(name = "cln_country")
    private String clnCountry;

    @Column(name = "cln_status")
    private String clnStatus;

    @Column(name = "cln_created_at")
    private LocalDateTime clnCreatedAt;

    @Column(name = "cln_created_by")
    private String clnCreatedBy;

    @Column(name = "cln_updated_at")
    private LocalDateTime clnUpdatedAt;

    @Column(name = "cln_updated_by")
    private String clnUpdatedBy;

	public Integer getClnSysId() {
		return clnSysId;
	}

	public void setClnSysId(Integer clnSysId) {
		this.clnSysId = clnSysId;
	}

	public String getClnName() {
		return clnName;
	}

	public void setClnName(String clnName) {
		this.clnName = clnName;
	}

	public String getClnPhoneNumber() {
		return clnPhoneNumber;
	}

	public void setClnPhoneNumber(String clnPhoneNumber) {
		this.clnPhoneNumber = clnPhoneNumber;
	}

	public String getClnTelNumber() {
		return clnTelNumber;
	}

	public void setClnTelNumber(String clnTelNumber) {
		this.clnTelNumber = clnTelNumber;
	}

	public String getClnAddressLine1() {
		return clnAddressLine1;
	}

	public void setClnAddressLine1(String clnAddressLine1) {
		this.clnAddressLine1 = clnAddressLine1;
	}

	public String getClnAddressLine2() {
		return clnAddressLine2;
	}

	public void setClnAddressLine2(String clnAddressLine2) {
		this.clnAddressLine2 = clnAddressLine2;
	}

	public String getClnAddressLine3() {
		return clnAddressLine3;
	}

	public void setClnAddressLine3(String clnAddressLine3) {
		this.clnAddressLine3 = clnAddressLine3;
	}

	public String getClnArea() {
		return clnArea;
	}

	public void setClnArea(String clnArea) {
		this.clnArea = clnArea;
	}

	public String getClnCity() {
		return clnCity;
	}

	public void setClnCity(String clnCity) {
		this.clnCity = clnCity;
	}

	public String getClnState() {
		return clnState;
	}

	public void setClnState(String clnState) {
		this.clnState = clnState;
	}

	public String getClnPincode() {
		return clnPincode;
	}

	public void setClnPincode(String clnPincode) {
		this.clnPincode = clnPincode;
	}

	public String getClnCountry() {
		return clnCountry;
	}

	public void setClnCountry(String clnCountry) {
		this.clnCountry = clnCountry;
	}

	public String getClnStatus() {
		return clnStatus;
	}

	public void setClnStatus(String clnStatus) {
		this.clnStatus = clnStatus;
	}

	public LocalDateTime getClnCreatedAt() {
		return clnCreatedAt;
	}

	public void setClnCreatedAt(LocalDateTime clnCreatedAt) {
		this.clnCreatedAt = clnCreatedAt;
	}

	public String getClnCreatedBy() {
		return clnCreatedBy;
	}

	public void setClnCreatedBy(String clnCreatedBy) {
		this.clnCreatedBy = clnCreatedBy;
	}

	public LocalDateTime getClnUpdatedAt() {
		return clnUpdatedAt;
	}

	public void setClnUpdatedAt(LocalDateTime clnUpdatedAt) {
		this.clnUpdatedAt = clnUpdatedAt;
	}

	public String getClnUpdatedBy() {
		return clnUpdatedBy;
	}

	public void setClnUpdatedBy(String clnUpdatedBy) {
		this.clnUpdatedBy = clnUpdatedBy;
	}

}
