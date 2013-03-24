package com.shengtao.manager.data.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ClassEntity implements Serializable {

	private static final long serialVersionUID = 9093403972864023891L;
	private String classId;
	private String className;
	private Date classYear;
	private String teacherId;

	private TeacherEntity teacherEntity;
	private List<StudentEntity> studentList;

	public String getClassId() {
		return classId;
	}

	public String getClassName() {
		return className;
	}

	public Date getClassYear() {
		return classYear;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public TeacherEntity getTeacherEntity() {
		return teacherEntity;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setClassYear(Date clasYear) {
		this.classYear = clasYear;
	}

	public void setTeacherEntity(TeacherEntity teacherEntity) {
		this.teacherEntity = teacherEntity;
	}

	public List<StudentEntity> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentEntity> studentList) {
		this.studentList = studentList;
	}

	public String toString() {
		return "ClassEntity - " + "£¬classId£º" + this.classId + "£¬className£º" + this.className + "£¬classYear£º" + this.classYear + "£¬teacherEntity£º"
				+ (this.teacherEntity == null ? "null" : "TeacherEntity Class");
	}
}
