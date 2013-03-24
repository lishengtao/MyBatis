package com.shengtao.manager.data.model;

import java.io.Serializable;
import java.util.Date;

public class TeacherEntity implements Serializable {

	private static final long serialVersionUID = -2080499466071573470L;

	private String professional = "";
	private Date teacherBirthday = null;
	private String teacherId = "";
	private String teacherName = "";
	private String teacherSex = "";
	private byte[] teacherPhoto;
	private Date workDate = null;
	
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}
	public Date getTeacherBirthday() {
		return teacherBirthday;
	}
	public void setTeacherBirthday(Date teacherBirthday) {
		this.teacherBirthday = teacherBirthday;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherSex() {
		return teacherSex;
	}
	public void setTeacherSex(String teacherSex) {
		this.teacherSex = teacherSex;
	}
	public byte[] getTeacherPhoto() {
		return teacherPhoto;
	}
	public void setTeacherPhoto(byte[] teacherPhoto) {
		this.teacherPhoto = teacherPhoto;
	}
	public Date getWorkDate() {
		return workDate;
	}
	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}	
	public String toString() {
		return "TeacherEntity - " + "id£º" + this.teacherId + 
			"£¬name£º"	+ this.teacherName + 
			"£¬sex£º" + this.teacherSex + 
			"£¬birthday£º" + (this.teacherBirthday != null ? this.teacherBirthday.toString() : "null") + 
			"£¬workDate£º" + (this.workDate != null ? this.workDate.toString() : "") + 
			"£¬professional£º" + this.professional;
	}
}
