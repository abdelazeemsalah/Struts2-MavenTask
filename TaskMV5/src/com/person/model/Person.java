package com.person.model;

//import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class Person {
	
	
	private int taskId;
	//@NotNull(message="User Name can not be null")
	@NotBlank(message="User Name can not be null")
private String userName;
	@NotNull(message="Age can not be null")
	//@NotBlank(message="Age can not be null")
	@Min(value=16,message="Age must be greater than 15")
private Long  age;
	@NotBlank(message="Email can not be null")
	//@NotNull(message="Email can not be null")
	@Pattern(regexp="^([a-z0-9]{1,}[\\.\\_\\-]?[a-z0-9]{1,})\\@([a-z0-9]{2,}\\.)([a-z]{2,2}|org|net|com|gov|edu|int|info|biz|museum)$",message="invalid email format")
private String email;
	
	 private String taskStatus;

//@NotEmpty(message="Please select a country")
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
//@NotEmpty(message="Please select a country")
public Long getAge() {
	return age;
}
public void setAge(Long age) {
	this.age = age;
}
//@NotEmpty(message="Please select a country")
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Person(String userName, Long age, String email) {
	super();
	this.userName = userName;
	this.age = age;
	this.email = email;
}
public Person()
{
	
}
public int getTaskId() {
	return taskId;
}
public void setTaskId(int taskId) {
	this.taskId = taskId;
}
public String getTaskStatus() {
	return taskStatus;
}
public void setTaskStatus(String taskStatus) {
	this.taskStatus = taskStatus;
}

}
