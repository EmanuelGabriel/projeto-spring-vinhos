package com.srsolution.vinhos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.srsolution.vinhos.model.Aluno;


public interface Alunos extends JpaRepository<Aluno, Long> {


	public List<Aluno> findByNomeContainingIgnoreCase (String nome);
	
	
	
	
}
