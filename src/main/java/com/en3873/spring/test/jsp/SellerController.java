package com.en3873.spring.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.en3873.spring.test.jsp.bo.SellerBO;
import com.en3873.spring.test.jsp.model.Seller;

@Controller
@RequestMapping("/jsp/seller")
public class SellerController {
	
	@Autowired
	private SellerBO sellerBO;
	
	// seller 추가
	@PostMapping("/add")
	@ResponseBody
	public String addSeller(
			@RequestParam("nickName") String nickName
			, @RequestParam("temperature") double temperature
			, @RequestParam("profileImage") String profileImage) {
		
		int count = sellerBO.addSeller(nickName, temperature, profileImage);
		
		return "삽입 결과 : " + count;
	}
	
	// 입력화면
	@GetMapping("/input")
	public String sellerInput() {
		return "jsp/sellerinput";
	}
	
	// 
	@GetMapping("/info")
	public String sellerInfo(
			@RequestParam(value="id", required=false) Integer id
			, Model model) {
		
		//Seller seller = sellerBO.getLastSeller();
		//model.addAttribute("seller", seller);
		//model.addAttribute("title", "최근 판매자");
		
//		Seller seller = null;
//		if (id == null) {
//			seller = sellerBO.getLastSeller();
//		} else {
//			seller = sellerBO.getSeller(id);
//		}
//		model.addAttribute("seller", seller);
		
		Seller seller = sellerBO.getSeller(id);
		
		model.addAttribute("seller", seller);
		
		return "jsp/sellerinfo";
	}
	
	@RequestMapping("/info/id")
	public String selletInfoById(@RequestParam("id") int id, Model model) {
		
		Seller seller = sellerBO.getSeller(id);
		model.addAttribute("seller", seller);
		
		return "jsp/sellerinfo";
	}
	
	

}
