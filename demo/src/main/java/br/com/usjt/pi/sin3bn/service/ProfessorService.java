package br.com.usjt.pi.sin3bn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.usjt.pi.sin3bn.repository.ProfessorRepo;

@Service
public class ProfessorService {
	
	@Autowired
    private ProfessorRepo professorRepo;

}
