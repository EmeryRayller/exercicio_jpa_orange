package exerciciobootcamp.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Dentro do bootcamp temos também um conjunto de avaliações
 *  que são respondidas pelas pessoas. Toda avaliação tem um 
 *  título e uma descrição do que precisa ser feito. Como você 
 *  vai modelar essa classe e configurá-la para que possa ser utilizada pelo Hibernate?
 */
@Entity
public class AvaliacaoBootcamp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
