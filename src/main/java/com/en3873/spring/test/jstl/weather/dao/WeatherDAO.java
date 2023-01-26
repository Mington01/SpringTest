package com.en3873.spring.test.jstl.weather.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.en3873.spring.test.jstl.weather.model.WeatherHistory;

@Repository
public interface WeatherDAO {
	
	public List<WeatherHistory> selectWeatherHistory();
	
	public int insertWeather(
			@Param("date") Date date
			, @Param("weather") String weather
			, @Param("temperatures") double temperatures
			, @Param("presipitation") double precipitation
			, @Param("microDust") String microDust
			, @Param("windSpeed") double windSpeed);

}
