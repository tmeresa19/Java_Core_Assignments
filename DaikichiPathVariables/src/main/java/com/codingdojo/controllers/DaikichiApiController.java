package com.codingdojo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiApiController {
	
	@GetMapping("/travel/{city}")
	public String travelCity(@PathVariable String city) {
		
		return "Congratulations! You will soon travel to " + city + "!";
	}
	
	@GetMapping("/lotto/{lottoNum}")
	public String lottoId6(@PathVariable int lottoNum) {
		if(lottoNum%2 == 0) {
		
		return "You will take a grand journey in the near future, but be wary of tempting offers";
	}else {
		
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
	}
 }
		
}

