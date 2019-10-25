package br.com.usjt.pi.sin3bn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "turma")
public class Turma {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	Aluno aluno = new Aluno();
	Professor professor = new Professor();
	
	public Turma() {
		
	}
	
	public Turma(Aluno aluno, Professor professor) {
		this.aluno = aluno;
		this.professor = professor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	@Override
	public String toString() {
		return "Turma [id=" + id + ", aluno=" + aluno + ", professor=" + professor + "]";
	}

}
