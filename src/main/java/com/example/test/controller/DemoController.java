package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.model.City;
import com.example.test.repository.DemoRepository;

@RestController
@EnableAutoConfiguration
public class DemoController {

	@Autowired
	DemoRepository demoRepository;
	
    @RequestMapping("/")
    String home() {
    	List<City> cidades = demoRepository.findAll();
    	StringBuffer s = new StringBuffer();
    	for (City city: cidades){
    		s.append(city.getName());
    		s.append("\n");
    	}
    
        return "Hello World!\n" + s ;
    }

}
