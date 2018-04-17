package com.rachid;

public class User {
private String name;
private int age;

public User() {
	super();
}

public User(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;



}

@Override
public String toString() {
	return "User [name=" + name + ", age=" + age + "]";
}



}
