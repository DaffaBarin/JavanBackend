package com.management.user.validation;

import com.management.user.validation.validator.UserRoleMustAdminValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD, METHOD, PARAMETER, ANNOTATION_TYPE, TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = {UserRoleMustAdminValidator.class})
@Documented
public @interface UserRoleMustAdmin {

    String message();

    String[] path() default {};

    Class<?>[] groups() default {};

    String propName();

    Class<? extends Payload>[] payload() default {};


}