package com.example.demo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entitys.StudentsNewEntity;
import com.example.demo.model.StudentModel;
import com.example.demo.producer.producerSend;
import com.example.demo.repository.StudentsRepository;
import com.example.demo.schema.StockHistory;
import com.example.demo.servicesimpl.StudentsService;

@Service
public class StudentsServiceImpl implements StudentsService {
	private  final Logger log = LoggerFactory.getLogger(StudentsServiceImpl.class);
	
	@Autowired
	private StudentsRepository repository;
	
	@Autowired
	private producerSend producerSend;
	
    @Override
	public ResponseEntity<?> studentNew(StudentModel request){
		StudentsNewEntity response = repository.save(mapperStudent(request));
		StockHistory stockHistory= StockHistory.newBuilder().build();
		stockHistory.setStudentId(response.getId());
		stockHistory.setName(response.getName());
		stockHistory.setLastName(response.getLastName());
		stockHistory.setMLastName(response.getmLastName());
		stockHistory.setUpdatedAt(response.getUpdatedAt());
		producerSend.send(stockHistory);
		log.info("Fin de servicio");
		return new ResponseEntity<>(response, HttpStatus.OK );
				
	}
	
	public StudentsNewEntity mapperStudent(StudentModel req) {
		StudentsNewEntity item = new StudentsNewEntity();
		item.setName(req.getName());
		item.setLastName(req.getLastName());
		item.setmLastName(req.getmLastName());
		item.setUpdatedAt(req.getUpdatedAt());
		
		return item;
	}
}
