package br.com.usjt.pi.sin3bn.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.usjt.pi.sin3bn.model.Aluno;
import br.com.usjt.pi.sin3bn.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoResource {
	
	@Autowired
	private AlunoService alunoService;
	
	@PostMapping
	public Aluno cadastrar(@RequestBody Aluno aluno) {
		return alunoService.cadastrar(aluno);
	}
	
	@PutMapping(value = "/alterar")
	public Aluno alterar(@RequestBody Aluno aluno, Aluno alunoNovo){
		return alunoService.alterar(aluno, alunoNovo);
	}

	@GetMapping(value = "/buscar")
	public Aluno buscar(@RequestBody Aluno aluno) {
		return alunoService.buscar(aluno.getId());
	}
	
	
	
	
}
