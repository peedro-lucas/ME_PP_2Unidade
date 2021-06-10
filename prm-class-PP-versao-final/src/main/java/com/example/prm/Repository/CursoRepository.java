package com.example.prm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prm.model.Curso;




@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
	
}
