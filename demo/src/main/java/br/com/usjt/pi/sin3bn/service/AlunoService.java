package br.com.usjt.pi.sin3bn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.usjt.pi.sin3bn.model.Aluno;
import br.com.usjt.pi.sin3bn.repository.AlunoRepo;

@Service
public class AlunoService {
	
	@Autowired
    private AlunoRepo alunoRepo;
	
	public Aluno cadastrar(Aluno aluno) {
		return salvar(aluno);
	}
	
	private Aluno salvar(Aluno aluno) {
		return alunoRepo.salvar(aluno);
	}

	public Aluno buscar(Long id) {
		return alunoRepo.buscar(id);
	}
	
	public Aluno alterar(Aluno aluno, Aluno alunoNovo) {
		aluno.setEmail(alunoNovo.getEmail());
		aluno.setSenha(alunoNovo.getSenha());
		aluno.setNome(alunoNovo.getNome());
		aluno.setRa(alunoNovo.getRa());
		aluno.setTurma(alunoNovo.getTurma());
		
		salvar(aluno);
		
		return aluno;
}
	
	public Aluno deletar(Aluno aluno) {
		return alunoRepo.deletar(aluno);
	}
	
}