package br.com.usjt.pi.sin3bn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.usjt.pi.sin3bn.model.Aula;


@Repository
public interface AulaRepo extends JpaRepository< Aula, Long>{
	
	Aula buscarPresencaPorAluno(Long id);

}
