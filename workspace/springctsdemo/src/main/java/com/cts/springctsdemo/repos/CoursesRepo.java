package com.cts.springctsdemo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.springctsdemo.entities.Course;

public interface CoursesRepo extends JpaRepository<Course, Integer> {
	
	public Course findCourseByTitle(String title);

}
