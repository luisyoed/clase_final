package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entitys.StudentsNewEntity;

public interface StudentsRepository extends JpaRepository<StudentsNewEntity,  Integer> {

}
