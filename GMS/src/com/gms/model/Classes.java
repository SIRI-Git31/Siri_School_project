package com.gms.model;

public class Classes {
int classId;
String className;
float classFee;
//parameterized constructor
public Classes(int classId, String className, float classFee) {
	super();
	this.classId = classId;
	this.className = className;
	this.classFee = classFee;
}
//setters and getters
public int getClassId() {
	return classId;
}
public void setClassId(int classId) {
	this.classId = classId;
}
public String getClassName() {
	return className;
}
public void setClassName(String className) {
	this.className = className;
}
public float getClassFee() {
	return classFee;
}
public void setClassFee(float classFee) {
	this.classFee = classFee;
}
}

