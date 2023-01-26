package com.en3873.spring.test.jstl.weather;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.en3873.spring.test.jstl.weather.bo.WeatherBO;
import com.en3873.spring.test.jstl.weather.model.WeatherHistory;

@Controller
@RequestMapping("/jstl/weather")
public class WeatherController {
	
	@Autowired
	private WeatherBO weatherHistoryBO;
	
	@GetMapping("/list")
	public String list(Model model) {
		
		// weatherhistory 리스트를 모델에 추가한다.
		List<WeatherHistory> weatherHistory = weatherHistoryBO.getWeatherHistory();
		
		model.addAttribute("weatherHistory", weatherHistory);
		
		return "jstl/weather/list";
	}
	
	@GetMapping("/add")
	public String addWeather(
			@DateTimeFormat(pattern="yyyy년 M월 d일")
			@RequestParam("date") Date date
			, @RequestParam("weather") String weather
			, @RequestParam("temperatures") double temperatures
			, @RequestParam("precipitation") double precipitation
			, @RequestParam("microDust") String microDust
			, @RequestParam("windSpeed") double windSpeed) {
		
			int count = weatherHistoryBO.addWeather(date, weather, temperatures, precipitation, microDust, windSpeed);
			
			return "redirect:/jstl/weather/list";
		
	}
	
	@GetMapping("/input")
	public String weatherInput() {
		
		return "jstl/weather/input";
	}

}
