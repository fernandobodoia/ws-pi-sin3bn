package br.com.usjt.pi.sin3bn.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.usjt.pi.sin3bn.model.Aluno;

@Repository
public interface AlunoRepo extends JpaRepository< Aluno, Long>{
	
	Aluno buscar(Long id);
	Aluno listarAlunos(ArrayList<Aluno> alunos);
	Aluno salvar(Aluno aluno);
	Aluno deletar(Aluno aluno);
}
