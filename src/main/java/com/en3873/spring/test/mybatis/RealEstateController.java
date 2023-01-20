package com.en3873.spring.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.en3873.spring.test.mybatis.bo.RealEstateBO;
import com.en3873.spring.test.mybatis.model.RealEstate;

@Controller
@RequestMapping("/mybatis")
public class RealEstateController {
	
	// id를 리퀘스트 파라미터로 전달 받고, 조회 결과를 json으로 response에 담는다.
	@Autowired
	private RealEstateBO realEstateBO;
	
	@RequestMapping("/test01/1")
	@ResponseBody
	public RealEstate realEstate(@RequestParam("id") int id) {
		
		RealEstate realEstate = realEstateBO.getRealEstate(id);
		
		return realEstate;
		
	}
	
	// 전달된 월세보다 낮은 매물 리스트 json으로 response 담는다.
	@RequestMapping("/test01/2")
	public List<RealEstate> realEstateByRent(@RequestParam("rent") int rentPrice) {
		
		List<RealEstate> realEstateList = realEstateBO.getRealEstateListByRent(rentPrice);
		
		return realEstateList;
	}
	
	// 넓이와 매매 가격을 전달 받고, 이에 상응하는 리스트를 json으로 response에 담는다.
	@RequestMapping("/test01/3")
	public List<RealEstate> realEstateByAreaPrice(
			@RequestParam("area") int area
			, @RequestParam("price") int price) {
		
		return realEstateBO.getRealEstateListByAreaPrice(area, price);
	}
	
	@RequestMapping("/test02/1")
	@ResponseBody
	public String addRealEstateByObject() {
		
		RealEstate realEstate = new RealEstate();
		realEstate.setOfficeId(3);
		realEstate.setAddress("푸르지움 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(10000);
		
		int count = realEstateBO.addRealEstateByObject(realEstate);
		
		return "입력 성공 : " + count;
	}
	
	@RequestMapping("/test02/2")
	@ResponseBody
	public String addRealEstate(@RequestParam("officeId") int officeId) {
		
		int count = realEstateBO.addRealEstate(officeId, "쌍떼빌리버 오피스텔 814호", 45, "월세", 10000, 120);
		
		return "입력 성공 : " + count;
	}
	
	@RequestMapping("/test03")
	@ResponseBody
	public String updateRealEstate() {
		
		// id가 24인 매물의 타입을 전세로, price를 70000으로 변경
		int count = realEstateBO.updateRealEstate(7, "전세", 70000);
		
		return "수정 성공 : " + count;
	}
	
	@RequestMapping("/test04")
	@ResponseBody
	public String deleteRealEstate(@RequestParam("id") int id) {
		
		int count = realEstateBO.deleteRealEstate(id);
		
		return "삭제 성공 : " + count;
	}

}
