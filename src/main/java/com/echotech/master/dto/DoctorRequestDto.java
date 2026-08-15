package com.echotech.master.dto;

public class DoctorRequestDto {

    private Integer docUserSysId;

    private String docFullName;

    private String docRegnNumber;

    private String docRegnCouncil;

    private String docRegnState;

    private String docQualifn;

    private String docSpecialn;

    private String docSubSpecialn;

    private Integer docYrsOfExp;

    private Double docConsultFee;

    private String docStatus;

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

}