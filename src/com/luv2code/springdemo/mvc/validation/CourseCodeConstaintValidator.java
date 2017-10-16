package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstaintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefix;

	// we give here the prefix
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();

	}

	// business logic, we can add here any kind of validation
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {

		boolean result = false;

		if (theCode != null) {

			for (String i : coursePrefix) {
				result = theCode.startsWith(i);

				if (result) {
					break;
				}
			}
		} else {
			result = true;
		}
		return result;
	}
}
