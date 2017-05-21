package com.shubham.spring.mvc;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String sid;
	private String qualification;
	private List<Qualification> qualificationList;
	
	public Student(){
		qualificationList=new ArrayList<Qualification>();
		Qualification quali=new Qualification();
		quali.setStream("BE");
		qualificationList.add(quali);
		quali=new Qualification();
		quali.setStream("B.Sc");
		qualificationList.add(quali);
		quali=new Qualification();
		quali.setStream("MCA");
		qualificationList.add(quali);
	}

	public List<Qualification> getQualificationList() {
		return qualificationList;
	}

	public void setQualificationList(List<Qualification> qualificationList) {
		this.qualificationList = qualificationList;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", qualification=" + qualification
				+ ", qualificationList=" + qualificationList + "]";
	}

}
