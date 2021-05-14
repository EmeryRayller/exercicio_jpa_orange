package exerciciobootcamp.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import exerciciobootcamp.modelo.CorrecaoAvaliacaoBootcamp;
import exerciciobootcamp.modelo.RespostaAvaliacaoBootcamp;

public class BuscarNomeDoAlunoPelaCorrecao {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicioJpa");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select r from RespostaAvaliacaoBootcamp r "
				+ "where r.id = :pCorrecaoId";
		
		CorrecaoAvaliacaoBootcamp cor = new CorrecaoAvaliacaoBootcamp();
		cor.setId(1L);
		
		TypedQuery<RespostaAvaliacaoBootcamp> respostaQuery = 
				em.createQuery(jpql, RespostaAvaliacaoBootcamp.class);
		respostaQuery.setParameter("pCorrecaoId", cor.getId());
		
		RespostaAvaliacaoBootcamp result = respostaQuery.getSingleResult();
		
		System.out.println(result.getAlunoBootcamp().getNome());
	}
	
}
