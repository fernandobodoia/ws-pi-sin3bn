package br.com.usjt.pi.sin3bn.resource;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.usjt.pi.sin3bn.model.Aluno;
import br.com.usjt.pi.sin3bn.model.Aula;
import br.com.usjt.pi.sin3bn.service.AulaService;

@RestController
@RequestMapping("/aula")
public class AulaResource {
	
	@Autowired
	private AulaService aulaService;
	
	/*@GetMapping(value = "/{id}")
	public ResponseEntity<Aula> buscarPresencaPorAluno(@PathVariable Long id){
        Aluno aluno = aulaService.buscar(id);

        return ResponseEntity.ok(administrador);
    }*/

}
