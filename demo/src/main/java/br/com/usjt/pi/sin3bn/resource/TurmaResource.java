package br.com.usjt.pi.sin3bn.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.usjt.pi.sin3bn.service.TurmaService;

@RestController
@RequestMapping("/turma")
public class TurmaResource {
	
	@Autowired
	private TurmaService turmaService;

}
