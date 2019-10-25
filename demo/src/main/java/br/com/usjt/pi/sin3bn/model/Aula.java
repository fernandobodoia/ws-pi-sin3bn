package br.com.usjt.pi.sin3bn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "aula")
public class Aula {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @NotBlank
	private Aluno aluno = new Aluno();
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public boolean isPresenca() {
		return presenca;
	}

	public void setPresenca(boolean presenca) {
		this.presenca = presenca;
	}

	@NotBlank
	private boolean presenca;
	
	public Aula(){
		
	}
	
	public Aula(Aluno aluno, boolean presenca) {
		this.aluno = aluno;
		this.presenca = presenca;
		
	}
	
	@Override
	public String toString() {
		return "Aula [id=" + id + ", aluno=" + aluno + "]";
	}

}
