package exerciciobootcamp.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Dado que todo(a) aluno(a) 
 * tem um email (máximo de 30 caracteres),
 * nome (máximo de 30 caracteres) e idade (entre 1 e 100). 
 * Como você vai modelar essa 
 * classe e configurá-la para que possa ser utilizada pelo Hibernate?
 */

@Entity
public class AlunoBootcamp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 100)
	private String email;
	
	@Column(length = 30)
	private String nome;
	
	private Integer idade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
}
