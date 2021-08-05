package com.jlcindia.spring.mvc;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
@ComponentScan("com.jlcindia.spring.mvc")
public class BidSearchController {
	@Autowired
	private BidValidator bidValidator;
	
	@RequestMapping(value="/searchStudent",method=RequestMethod.POST)
	public String searchStudent(@ModelAttribute("bidSearchCommand") BidSearchCommand bidCommand, BindingResult errors,
			Model model, HttpServletRequest req) throws ServletException {
		String result = "bidsearch";
		System.out.println("searchStudent");
		bidValidator.validate(bidCommand, errors);
		if (errors.hasErrors()) {
			System.out.println(errors.getErrorCount());
			return result;
		}
		String bid = bidCommand.getBid();
		System.out.println(bid);
		if (bid.equals("B-12") || bid.equals("B-99")) {
			StudentTO sto = new StudentTO();
			sto.setSid("JLC-123");
			sto.setBid(bid);
			sto.setName("Srinivas");
			sto.setEmail("sri@jlc.com");
			sto.setPhone("99999");

			List<StudentTO> sList = new ArrayList<StudentTO>();
			sList.add(sto);
			sList.add(sto);
			sList.add(sto);
			sList.add(sto);
			sList.add(sto);

			model.addAttribute("SLIST", sList);
			result = "bidresults";
		} else {
			errors.rejectValue("bid", "bid.notfound");
		}
		return result;
	}

	// Defining Command Object
	@ModelAttribute("bidSearchCommand")
	public BidSearchCommand createBidSearchCommand() {
		return new BidSearchCommand();
	}

	@RequestMapping(value = "/bidsearch")
	protected String showSearchPage() throws ServletException {
		return "bidsearch";
	}
}
