package exerciciobootcamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exerciciobootcamp.modelo.AlunoBootcamp;
import exerciciobootcamp.modelo.AvaliacaoBootcamp;
import exerciciobootcamp.modelo.RespostaAvaliacaoBootcamp;

public class CriarAluno {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicioJpa");
		EntityManager em = emf.createEntityManager();

		AlunoBootcamp aluno1 = new AlunoBootcamp();
		aluno1.setEmail("geraldo@gmail.com");
		aluno1.setNome("Geraldo");
		aluno1.setIdade(30);
		
		em.getTransaction().begin();
		em.persist(aluno1);
		em.getTransaction().commit();
		em.close();

	}
}
