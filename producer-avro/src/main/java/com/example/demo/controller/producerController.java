package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentModel;
import com.example.demo.servicesimpl.StudentsService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/producer")
public class producerController {
	static final Logger log = LoggerFactory.getLogger(producerController.class);
	
	@Autowired
	StudentsService service;
	
	@PostMapping(value = "/publishMessage", consumes = MediaType.APPLICATION_JSON_VALUE,  produces =  MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> seandMessage(@RequestBody StudentModel request){
		log.info("inicia de servicio");
		ResponseEntity<?>  response = service.studentNew(request);
		log.info("Fin de servicio");
		
		return response;
		
	}
	
}
