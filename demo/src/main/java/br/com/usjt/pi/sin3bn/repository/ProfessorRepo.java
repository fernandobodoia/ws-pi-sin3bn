package br.com.usjt.pi.sin3bn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.usjt.pi.sin3bn.model.Professor;

@Repository
public interface ProfessorRepo extends JpaRepository< Professor, Long> {
	
	Professor buscarTurmas(Long id);

}
