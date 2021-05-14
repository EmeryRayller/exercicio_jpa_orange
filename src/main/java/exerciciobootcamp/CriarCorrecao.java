package exerciciobootcamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exerciciobootcamp.modelo.AlunoBootcamp;
import exerciciobootcamp.modelo.CorrecaoAvaliacaoBootcamp;
import exerciciobootcamp.modelo.NotaAvaliacao;
import exerciciobootcamp.modelo.RespostaAvaliacaoBootcamp;

public class CriarCorrecao {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicioJpa");
		EntityManager em = emf.createEntityManager();

		CorrecaoAvaliacaoBootcamp corr = new CorrecaoAvaliacaoBootcamp();
		
		corr.setNota(NotaAvaliacao.QUATRO.getValue());
		
		em.getTransaction().begin();
		
		RespostaAvaliacaoBootcamp resp = em.find(RespostaAvaliacaoBootcamp.class, 2L);
		corr.setRepostaAvaliacao(resp);
		
		em.persist(corr);
		em.getTransaction().commit();
		em.close();

	}
}
