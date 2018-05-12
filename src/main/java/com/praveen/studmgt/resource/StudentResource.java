package com.praveen.studmgt.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentResource {
	
	@GetMapping()
	public String getStudents() {
		return "Get all students";
	}

}
