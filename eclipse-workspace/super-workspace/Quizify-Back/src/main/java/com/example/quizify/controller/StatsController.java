package com.example.quizify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quizify.service.ServiceStats;
import com.example.quizify.service.dto.StatsDto;

@RestController
@RequestMapping("/api/stats")
public class StatsController {
	
	@Autowired(required = true)
	private ServiceStats serviceStats;

	
	
	//4 verbes HTTP
	@GetMapping
	public List<StatsDto> getStats(){
		return serviceStats.getAllStats();
	}
}
