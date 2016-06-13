package it.uniroma3.model;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public class EsameFacade {

	@PersistenceContext(unitName = "progettoSiw")
	private EntityManager em;
	
	public Esame createEsame(String nome, String codice, TipologiaEsame tipo) {
		Esame esame = new Esame(nome, codice, tipo);
		em.persist(esame);
		return esame;
	}
	
	public Esame getEsame(Long id) {
		Esame esame = em.find(Esame.class, id);
		return esame;
	}
	
	public List<Esame> trovaTuttiEsami() {
		CriteriaQuery<Esame> cq = em.getCriteriaBuilder().createQuery(Esame.class);
		cq.select(cq.from(Esame.class));
		List<Esame> esami = em.createQuery(cq).getResultList();
		return esami;
	}
	
	public void updateEsame(Esame esame) {
		em.merge(esame);
	}
	
	public void deleteEsame(Esame esame) {
		em.remove(esame);
	}
	
	public void deleteEsame(Long id) {
		Esame esame = em.find(Esame.class, id);
		deleteEsame(esame);
	}
}
