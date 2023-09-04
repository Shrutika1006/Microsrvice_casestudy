package com.example.Courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Courses.model.course;
import com.example.Courses.repository.courserepository;

public class HomeController {
	public String sayHi() {
		   return "Hello from Spring boot!";
	   }
	   
	   @Autowired

		courserepository repository;
	 
	   @GetMapping("/course")
	   public List<course> getCourse(){
		List<course> courseList=repository.findAll();
		return courseList;
		
	}
	@GetMapping("/course/find/{id}")
	public course getCourseId(@PathVariable ("id")int id) {
		Optional<course>  course =repository.findById(id);
	if(course.isPresent()) {
		return course.get();
	
	}
	else
	{
		return null;
	}
}
}