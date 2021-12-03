package org.devinho.springdemo.controllers.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
    private String coursePrefix;

    @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
        if (code != null) {
            return code.startsWith(coursePrefix);
        }
        return true;
    }

    @Override
    public void initialize(CourseCode courseCode) {
        coursePrefix = courseCode.value();
    }
}
