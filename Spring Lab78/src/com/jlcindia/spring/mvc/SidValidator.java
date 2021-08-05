package com.jlcindia.spring.mvc;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class SidValidator implements Validator {

	@Override
	public boolean supports(Class clazz) {
		return SidSearchCommand.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		SidSearchCommand sidSearchCommand = (SidSearchCommand) obj;
		String sid = sidSearchCommand.getSid();
		if (sid == null || sid.length() == 0) {
			errors.rejectValue("sid", "errors.sid.required",new Object[]{}, "Student Id is Required");
		} else if (!sid.startsWith("JLC-")) {
			errors.rejectValue("sid", "errors.sid.format",new Object[]{}, "Student Id must starts with JLC-");
		} else {
			try {
				String temp = sid.substring(4);
				int x = Integer.parseInt(temp);
				if (x < 100 || x > 999)
					errors.rejectValue("sid", "errors.sid.range",new Object[]{}, "Only 3 digits allowed after JLC-");
			} catch (Exception e) {
				errors.rejectValue("sid", "errors.sid.integer",new Object[]{}, "Only digits allowed after JLC-");
			}
		}
	}
}
