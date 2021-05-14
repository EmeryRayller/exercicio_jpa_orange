package exerciciobootcamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exerciciobootcamp.modelo.AlunoBootcamp;
import exerciciobootcamp.modelo.AvaliacaoBootcamp;
import exerciciobootcamp.modelo.RespostaAvaliacaoBootcamp;

public class CriarResposta {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicioJpa");
		EntityManager em = emf.createEntityManager();

		RespostaAvaliacaoBootcamp resp = new RespostaAvaliacaoBootcamp();
		resp.setResposta("Resposta sobre avaliação de JPA");
		
		em.getTransaction().begin();
		
		AlunoBootcamp aluno = em.find(AlunoBootcamp.class, 2L);
		AvaliacaoBootcamp aval = em.find(AvaliacaoBootcamp.class, 2L);
		
		resp.setAlunoBootcamp(aluno);
		resp.setAvaliacaoBootcamp(aval);
		
		em.persist(resp);
		em.getTransaction().commit();
		em.close();

	}
}
