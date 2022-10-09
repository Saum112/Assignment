package com.project.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public Map<String, String> sayHello() {
		HashMap<String, String> map = new HashMap<>();
		map.put("message", "hello world");
		return map;
	}

	@PostMapping("/hello")
	public Map<String, String> postHello(@RequestBody Map<String, String> data) {
		HashMap<String, String> map = new HashMap<>();
		String li = data.values().stream().toList().get(0);
		String val = "hello " + li;
		map.put("message", val);
		return map;
	}

}
