package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.student;
import com.example.demo.repository.studentrepository;

@RestController
@RequestMapping("/home")

public class Homecontroller {
	
	
	
	
	   public String sayHi() {
		   return "Hello from Spring boot!";
	   }
	   
	   @Autowired

		studentrepository repository;
	 
	   @GetMapping("/student")
	   public List<student> getStudents(){
		List<student> studList=repository.findAll();
		return studList;
		
	}
	@GetMapping("/student/find/{id}")
	public student getStudentId(@PathVariable ("id")int id) {
		Optional<student>  stud =repository.findById(id);
	if(stud.isPresent()) {
		return stud.get();
	
	}
	else
	{
		return null;
	}
}
}
