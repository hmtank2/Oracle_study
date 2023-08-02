package com.Dto;

public class StudentDTO {
	String stuNo;
	String departNo;
	
	String stuName;
	String stuSsn;
	String stuAddress;
	String entDate;
	char absYn;
	String coachProfessorNo;
	public StudentDTO() {
		
	}
	public StudentDTO(String stuNo, String departNo, String stuName, String stuSsn, String stuAddress, String entDate,
			char absYn, String coachProfessorNo) {
		this.stuNo = stuNo;
		this.departNo = departNo;
		this.stuName = stuName;
		this.stuSsn = stuSsn;
		this.stuAddress = stuAddress;
		this.entDate = entDate;
		this.absYn = absYn;
		this.coachProfessorNo = coachProfessorNo;
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getDepartNo() {
		return departNo;
	}
	public void setDepartNo(String departNo) {
		this.departNo = departNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSsn() {
		return stuSsn;
	}
	public void setStuSsn(String stuSsn) {
		this.stuSsn = stuSsn;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public String getEntDate() {
		return entDate;
	}
	public void setEntDate(String entDate) {
		this.entDate = entDate;
	}
	public char getAbsYn() {
		return absYn;
	}
	public void setAbsYn(char absYn) {
		this.absYn = absYn;
	}
	public String getCoachProfessorNo() {
		return coachProfessorNo;
	}
	public void setCoachProfessorNo(String coachProfessorNo) {
		this.coachProfessorNo = coachProfessorNo;
	}
	@Override
	public String toString() {
		return stuNo +"\t"+ departNo+"\t" + stuName+"\t"+ stuSsn +"\t"+stuAddress+"\t\t"+ entDate
				+absYn +"\t"+ coachProfessorNo;
	}
	
	
	
}
