package com.en3873.spring.test.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.en3873.spring.test.lifecycle.model.Content;

@RestController // @Controller + ResponseBody
@RequestMapping("/lifecycle/test02")
public class Test02_HttpMessageConverter {
	
	@ResponseBody
	@RequestMapping("/1")
	public ArrayList mapResponse1() {
		
		ArrayList<Map<String, Object>> movies = new ArrayList();
		
		Map<String, Object> movieMap = new HashMap<>();
		movieMap.put("rate", 15);
		movieMap.put("director", "봉준호");
		movieMap.put("time", 131);
		movieMap.put("title", "기생충");
		movies.add(movieMap);
		
		movieMap = new HashMap<>();
		movieMap.put("rate", 0);
		movieMap.put("director", "로베르토 베니니");
		movieMap.put("time", 116);
		movieMap.put("title", "인생은 아름다워");
		movies.add(movieMap);
		
		movieMap = new HashMap<>();
		movieMap.put("rate", 12);
		movieMap.put("director", "크리스토퍼 놀란");
		movieMap.put("time", 147);
		movieMap.put("title", "인셉션");
		movies.add(movieMap);
		
		movieMap = new HashMap<>();
		movieMap.put("rate", 19);
		movieMap.put("director", "윤종빈");
		movieMap.put("time", 133);
		movieMap.put("title", "범죄와의 전쟁 : 나쁜놈들 전성시대");
		movies.add(movieMap);
		
		movieMap = new HashMap<>();
		movieMap.put("rate", 15);
		movieMap.put("director", "프란시스 로렌스");
		movieMap.put("time", 137);
		movieMap.put("title", "헝거게임");
		movies.add(movieMap);
		
		return movies;
		
	}
	
	@ResponseBody
	@RequestMapping("/2")
	public ArrayList Response() {
		
		ArrayList contentList = new ArrayList();
		
		Content content = new Content();
		content.setTitle("안녕하세요 가입인사 드립니다.");
		content.setUser("hangulu");
		content.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
		contentList.add(content);
		
		content = new Content();
		content.setTitle("헐 대박");
		content.setUser("bada");
		content.setContent("오늘 목요일이었어... 금요일인줄");
		contentList.add(content);
		
		content = new Content();
		content.setTitle("오늘 데이트 한 이야기 해드릴게요.");
		content.setUser("dulumary");
		content.setContent("....");
		contentList.add(content);
		
		return contentList;
		
	}
	
	@ResponseBody
	@RequestMapping("/3")
	public ResponseEntity<Content> entity() {
		
		Content content = new Content();
		content.setTitle("안녕하세요 가입인사 드립니다.");
		content.setUser("hangulu");
		content.setContent("안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다.");
		
		// http status code
		ResponseEntity<Content> entity = new ResponseEntity(content, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
		
	}

}
