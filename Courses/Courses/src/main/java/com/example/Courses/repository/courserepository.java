package com.example.Courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Courses.model.course;

public interface courserepository extends JpaRepository <course ,Integer>{

}
