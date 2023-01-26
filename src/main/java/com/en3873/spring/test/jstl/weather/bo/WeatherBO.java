package com.en3873.spring.test.jstl.weather.bo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.en3873.spring.test.jstl.weather.dao.WeatherDAO;
import com.en3873.spring.test.jstl.weather.model.WeatherHistory;

@Service
public class WeatherBO {
	
	@Autowired
	private WeatherDAO weatherHistoryDAO;
	
	// weatherhistory의 모든 데이터 조회
	public List<WeatherHistory> getWeatherHistory() {
		
		return weatherHistoryDAO.selectWeatherHistory();
	}
	public int addWeather(
			Date date
			, String weather
			, double temperatures
			, double precipitation
			, String microDust
			, double windSpeed) {
		
		return weatherHistoryDAO.insertWeather(date, weather, temperatures, precipitation, microDust, windSpeed);
		
	}

}
