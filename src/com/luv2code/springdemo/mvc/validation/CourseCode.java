package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// What is the validator of this annotation
@Constraint(validatedBy = CourseCodeConstaintValidator.class)
// Witch field can we use this annotation(class,method,field)
@Target({ElementType.METHOD, ElementType.FIELD})
// How long this annotation shall be active (on runtime)
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	// define default course code
	public String[] value() default "LUV";
	// define default error message
	public String message() default "must start with LUV";
	// define default group, any class and groups can use this: <?>[]
	public Class<?>[] groups() default {};
	// define default payload
    public Class<? extends Payload>[] payload() default {};
}
