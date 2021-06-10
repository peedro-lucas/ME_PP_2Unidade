package com.example.prm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prm.Repository.CursoRepository;
import com.example.prm.model.Curso;

@RestController
@RequestMapping("/curso")
public class CursoController {
	
	@Autowired
	private CursoRepository cursoRepository; 
	
	
	
	@GetMapping
	public List<Curso> listar() {
		return cursoRepository.findAll();
	}
	
	@PostMapping
	public Curso criarCurso(@RequestBody Curso curso) {
		return cursoRepository.save(curso);
		
				
	}
	
	@DeleteMapping
	public void deletar(@RequestBody Curso curso) {
		cursoRepository.delete(curso);
		
			
	}
	
	@PutMapping
	public Curso att(@RequestBody Curso curso) {
		return cursoRepository.save(curso);
		
				
	}
	
	
	
}

