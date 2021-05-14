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
		avaliacaoBootcamp.setDescricao("Descri��o avalia��o JPA");
		avaliacaoBootcamp.setTitulo("Titulo Avalia��o de JPA");
		
		em.getTransaction().begin();
		em.persist(avaliacaoBootcamp);
		em.getTransaction().commit();
		em.close();

	}
}
