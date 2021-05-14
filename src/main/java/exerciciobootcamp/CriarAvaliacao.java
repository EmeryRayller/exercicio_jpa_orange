package exerciciobootcamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exerciciobootcamp.modelo.AlunoBootcamp;
import exerciciobootcamp.modelo.AvaliacaoBootcamp;

public class CriarAvaliacao {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicioJpa");
		EntityManager em = emf.createEntityManager();

		AvaliacaoBootcamp avaliacaoBootcamp = new AvaliacaoBootcamp();
		avaliacaoBootcamp.setDescricao("Descrição avaliação JPA");
		avaliacaoBootcamp.setTitulo("Titulo Avaliação de JPA");
		
		em.getTransaction().begin();
		em.persist(avaliacaoBootcamp);
		em.getTransaction().commit();
		em.close();

	}
}
