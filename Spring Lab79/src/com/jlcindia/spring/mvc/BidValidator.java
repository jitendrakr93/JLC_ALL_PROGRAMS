package com.jlcindia.spring.mvc;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class BidValidator implements Validator{

	@Override
	public boolean supports(Class clazz) {
		return BidSearchCommand.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		BidSearchCommand bidSearchCommand=(BidSearchCommand) obj;
		String bid=bidSearchCommand.getBid();
		if(bid == null || bid.length() == 0){
			errors.rejectValue("bid","errors.bid.required",new Object[]{}, "BID  is Required");
		}else if(!bid.startsWith("B-")){
			errors.rejectValue("bid","errors.bid.format",new Object[]{}, "BId must starts with B-");
		}else {
			try{
				String temp=bid.substring(2);
				int x=Integer.parseInt(temp);
				if(x < 10 || x>99)
					errors.rejectValue("bid", "errors.bid.range",new Object[]{}, "Only 3 digits allowed after B-");
			}catch(Exception e){
				errors.rejectValue("bid","errors.bid.integer",new Object[]{}, "Only digit allowed after B-");
			}
		}
			
	}

}
