package exerciciobootcamp.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/*
 * Al�m de responder sua avalia��o, a pessoa 
 * tamb�m responde um outro formul�rio onde ela 
 * corrige sua resposta em fun��o da resposta de um mentor(a). 
 * Essa corre��o sempre tem uma nota de 1 a 10 e est� linkada com 
 * a avalia��o respondida pela pr�pria pessoa. Como voc� vai modelar 
 * essa classe e configur�-la para que possa ser utilizada pelo Hibernate?
 */
@Entity
public class CorrecaoAvaliacaoBootcamp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer nota;

	@JoinColumn(unique = true)
	@OneToOne
	private RespostaAvaliacaoBootcamp repostaAvaliacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNotaAvaliacao() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public RespostaAvaliacaoBootcamp getRepostaAvaliacao() {
		return repostaAvaliacao;
	}

	public void setRepostaAvaliacao(RespostaAvaliacaoBootcamp repostaAvaliacao) {
		this.repostaAvaliacao = repostaAvaliacao;
	}



	
}
