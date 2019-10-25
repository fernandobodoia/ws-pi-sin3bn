package br.com.usjt.pi.sin3bn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.usjt.pi.sin3bn.repository.TurmaRepo;

@Service
public class TurmaService {
	
	@Autowired
    private TurmaRepo TurmaRepo;

}
