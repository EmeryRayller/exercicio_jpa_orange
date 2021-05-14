package exerciciobootcamp.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/*
 * Cada aluno(a) responde uma ou mais avalia��es que chamamos de 
 * cognitive walkthrough, ela tem que descrever os passos da solu��o 
 * dela para determinada situa��o problema. Toda resposta tem um campo 
 * aberto para que a pessoa consiga descrever a solu��o dela. � necess�rio que toda 
 * resposta seja linkada com a pessoa que a respondeu e tamb�m com a 
 * avalia��o relativa �quela resposta. Como voc� vai modelar essa classe e 
 * configur�-la para que possa ser utilizada pelo Hibernate?
 */

@Entity
public class RespostaAvaliacaoBootcamp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String resposta;
	
	@ManyToOne
	private AlunoBootcamp alunoBootcamp;
	
	@ManyToOne
	private AvaliacaoBootcamp avaliacaoBootcamp;
	
	

	@Override
	public String toString() {
		return "|" + " id: "+ this.id + "|" + 
	" reposta: " + this.resposta + " | " + " aluno: " + this.alunoBootcamp.getNome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public AlunoBootcamp getAlunoBootcamp() {
		return alunoBootcamp;
	}

	public void setAlunoBootcamp(AlunoBootcamp alunoBootcamp) {
		this.alunoBootcamp = alunoBootcamp;
	}

	public AvaliacaoBootcamp getAvaliacaoBootcamp() {
		return avaliacaoBootcamp;
	}

	public void setAvaliacaoBootcamp(AvaliacaoBootcamp avaliacaoBootcamp) {
		this.avaliacaoBootcamp = avaliacaoBootcamp;
	}
	
	
}
