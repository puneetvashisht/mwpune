package com.cts.springctsdemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.springctsdemo.entities.Course;
import com.cts.springctsdemo.repos.CoursesRepo;

@RestController
public class CourseController {
	
	@Autowired
	CoursesRepo coursesRepo;
	
//	List<Course> courses = new ArrayList<>();
	@RequestMapping(path="/courses/{title}", method=RequestMethod.GET)
	public ResponseEntity<Course> getCoursesByTitle(@PathVariable("title") String title){
//		return this.courses;÷
		Course courseFound =  coursesRepo.findCourseByTitle(title);
		ResponseEntity<Course> re = null;
		if(courseFound==null){
			re = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		else{
			re = new ResponseEntity<>(courseFound,HttpStatus.OK);
		}
		
		System.out.println(courseFound);
		return re;
//		return coursesRepo.findAll();
	}
	
	@RequestMapping(path="/courses", method=RequestMethod.GET)
	public List<Course> getCourses(){
//		return this.courses;÷
		return coursesRepo.findAll();
	}
	@RequestMapping(path="/courses", method=RequestMethod.POST)
	public ResponseEntity<Void> addCourse(@RequestBody Course course){
		
		System.out.println(course);
		coursesRepo.save(course);
		ResponseEntity<Void> re = new ResponseEntity<>(HttpStatus.CREATED);
		return re;
//		this.courses.add(course);
		
	}

}
