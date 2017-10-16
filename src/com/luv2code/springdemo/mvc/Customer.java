package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {
	
	
	@NotNull(message="is required")
	@Size(min=1, message="is requied")
	private String lastName;	
	private String firstName;
	
	@NotNull(message="is required")
	@Min(value = 0, message = "type a number beetwen 0 and 10")
	@Max(value = 10, message = "type a number beetwen 0 and 10")
	private Integer entry;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
	private String postalCode;
	
	@CourseCode(value = {"TOPS","LUV"}, message = "Code must start with TOPS or LUV")
	private String courseCode;
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Integer getEntry() {
		return entry;
	}
	public void setEntry(Integer entry) {
		this.entry = entry;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	

}
