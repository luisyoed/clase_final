package com.example.demo.servicesimpl;

import org.springframework.http.ResponseEntity;

import com.example.demo.model.StudentModel;

public interface StudentsService {

	ResponseEntity<?> studentNew(StudentModel request);


}
