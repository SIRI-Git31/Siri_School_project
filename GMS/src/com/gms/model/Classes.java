package com.gms.model;

public class Classes {
int classId;
String className;
String classCode;
int teacherId;
int studentCount;
//constructor
public Classes(int classId, String className, String classCode, int teacherId, int studentCount) {
	this.classId = classId;
	this.className = className;
	this.classCode = classCode;
	this.teacherId = teacherId;
	this.studentCount = studentCount;
}
	
		
	//getters and setters
	public int getClassId() {
		return classId;
		}
	public void setClassId(int classId) {
		this.classId = classId;
	}public String getClassName() {
		return className;
	}public void setClassName(String className) {
		this.className = className;
}public String getClassCode() {
	return classCode;
	}public void setClassCode(String classCode) {
		this.classCode = classCode;
	}public int getTeacherId() {
		return teacherId;
	}public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}public int getStudentCount() {
		return studentCount;
	}public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
}
