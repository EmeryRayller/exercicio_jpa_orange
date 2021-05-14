package exerciciobootcamp.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import exerciciobootcamp.modelo.AlunoBootcamp;
import exerciciobootcamp.modelo.RespostaAvaliacaoBootcamp;

public class BuscarAlunosPorResposta {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicioJpa");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select r from RespostaAvaliacaoBootcamp r join r.alunoBootcamp a"
				+ " where a = :pAluno";
		
		AlunoBootcamp aluno = new AlunoBootcamp();
		aluno.setId(2L);
		
		TypedQuery<RespostaAvaliacaoBootcamp> respostaQuery = 
				em.createQuery(jpql, RespostaAvaliacaoBootcamp.class);
		respostaQuery.setParameter("pAluno", aluno);
		
		
		
		List<RespostaAvaliacaoBootcamp> list = respostaQuery.getResultList();
		for (RespostaAvaliacaoBootcamp respostaAvaliacaoBootcamp : list) {
			System.out.println(respostaAvaliacaoBootcamp.toString());
		}
		
	}
	
}
