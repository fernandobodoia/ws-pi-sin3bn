package br.com.usjt.pi.sin3bn.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.usjt.pi.sin3bn.service.ProfessorService;

@RestController
@RequestMapping("/professor")
public class ProfessorResource {
	
	@Autowired
	private ProfessorService professorService;

}
