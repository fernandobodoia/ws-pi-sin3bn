package br.com.usjt.pi.sin3bn.repository;

import java.util.ArrayList;

import br.com.usjt.pi.sin3bn.model.Turma;

@Repository
public interface TurmaRepo extends JpaRepository< Turma, Long> {
	
	ArrayList<Turma> turmas = new ArrayList<Turma>(); 

}
