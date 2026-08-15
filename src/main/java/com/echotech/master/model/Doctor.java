package com.echotech.master.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "doctor_master")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doc_sys_id")
    private Integer docSysId;

    @Column(name = "doc_user_sys_id")
    private Integer docUserSysId;

    @Column(name = "doc_full_name")
    private String docFullName;

    @Column(name = "doc_regn_number", unique = true)
    private String docRegnNumber;

    @Column(name = "doc_regn_council")
    private String docRegnCouncil;

    @Column(name = "doc_regn_state")
    private String docRegnState;

    @Column(name = "doc_qualifn")
    private String docQualifn;

    @Column(name = "doc_specialn")
    private String docSpecialn;

    @Column(name = "doc_sub_specialn")
    private String docSubSpecialn;

    @Column(name = "doc_yrs_of_exp")
    private Integer docYrsOfExp;

    @Column(name = "doc_consult_fee")
    private Double docConsultFee;

    @Column(name = "doc_status")
    private String docStatus;

    @Column(name = "doc_created_at")
    private LocalDateTime docCreatedAt;

    @Column(name = "doc_created_by")
    private String docCreatedBy;

    @Column(name = "doc_updated_at")
    private LocalDateTime docUpdatedAt;

    @Column(name = "doc_updated_by")
    private String docUpdatedBy;

	public Integer getDocSysId() {
		return docSysId;
	}

	public void setDocSysId(Integer docSysId) {
		this.docSysId = docSysId;
	}

	public Integer getDocUserSysId() {
		return docUserSysId;
	}

	public void setDocUserSysId(Integer docUserSysId) {
		this.docUserSysId = docUserSysId;
	}

	public String getDocFullName() {
		return docFullName;
	}

	public void setDocFullName(String docFullName) {
		this.docFullName = docFullName;
	}

	public String getDocRegnNumber() {
		return docRegnNumber;
	}

	public void setDocRegnNumber(String docRegnNumber) {
		this.docRegnNumber = docRegnNumber;
	}

	public String getDocRegnCouncil() {
		return docRegnCouncil;
	}

	public void setDocRegnCouncil(String docRegnCouncil) {
		this.docRegnCouncil = docRegnCouncil;
	}

	public String getDocRegnState() {
		return docRegnState;
	}

	public void setDocRegnState(String docRegnState) {
		this.docRegnState = docRegnState;
	}

	public String getDocQualifn() {
		return docQualifn;
	}

	public void setDocQualifn(String docQualifn) {
		this.docQualifn = docQualifn;
	}

	public String getDocSpecialn() {
		return docSpecialn;
	}

	public void setDocSpecialn(String docSpecialn) {
		this.docSpecialn = docSpecialn;
	}

	public String getDocSubSpecialn() {
		return docSubSpecialn;
	}

	public void setDocSubSpecialn(String docSubSpecialn) {
		this.docSubSpecialn = docSubSpecialn;
	}

	public Integer getDocYrsOfExp() {
		return docYrsOfExp;
	}

	public void setDocYrsOfExp(Integer docYrsOfExp) {
		this.docYrsOfExp = docYrsOfExp;
	}

	public Double getDocConsultFee() {
		return docConsultFee;
	}

	public void setDocConsultFee(Double docConsultFee) {
		this.docConsultFee = docConsultFee;
	}

	public String getDocStatus() {
		return docStatus;
	}

	public void setDocStatus(String docStatus) {
		this.docStatus = docStatus;
	}

	public LocalDateTime getDocCreatedAt() {
		return docCreatedAt;
	}

	public void setDocCreatedAt(LocalDateTime docCreatedAt) {
		this.docCreatedAt = docCreatedAt;
	}

	public String getDocCreatedBy() {
		return docCreatedBy;
	}

	public void setDocCreatedBy(String docCreatedBy) {
		this.docCreatedBy = docCreatedBy;
	}

	public LocalDateTime getDocUpdatedAt() {
		return docUpdatedAt;
	}

	public void setDocUpdatedAt(LocalDateTime docUpdatedAt) {
		this.docUpdatedAt = docUpdatedAt;
	}

	public String getDocUpdatedBy() {
		return docUpdatedBy;
	}

	public void setDocUpdatedBy(String docUpdatedBy) {
		this.docUpdatedBy = docUpdatedBy;
	}

}
