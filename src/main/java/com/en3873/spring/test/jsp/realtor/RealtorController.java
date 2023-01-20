package com.en3873.spring.test.jsp.realtor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.en3873.spring.test.jsp.realtor.bo.RealtorBO;
import com.en3873.spring.test.jsp.realtor.model.Realtor;

@Controller
@RequestMapping("/jsp/realtor")
public class RealtorController {
	
	@Autowired
	private RealtorBO realtorBO;
	
	@GetMapping("/input")
	public String realtorInput() {
		return "jsp/realtorinput";
	}
	
	@PostMapping("/add")
	public String addRealtor(
//			@RequestParam("office") String office
//			, @RequestParam("phoneNumber") String phoneNumber
//			, @RequestParam("address") String address
//			, @RequestParam("grade") String grade
			@ModelAttribute Realtor realtor
			, Model model) {
		
//		Realtor realtor = new Realtor();
//		realtor.setOffice(office);
//		realtor.setPhoneNumber(phoneNumber);
//		realtor.setAddress(address);
//		realtor.setGrade(grade);
		
		realtorBO.addRealtor(realtor);
		
		model.addAttribute("realtor", realtor);
		
		return "jsp/realtorinfo";
	}

}
