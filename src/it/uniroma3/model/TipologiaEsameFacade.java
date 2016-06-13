package it.uniroma3.model;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public class TipologiaEsameFacade {
	
	@PersistenceContext(unitName = "progettoSiw")
	private EntityManager em;

	public TipologiaEsame createTipologiaEsame(String nome, String codice, String descrizione, Float prezzo, String prerequisito) {
		TipologiaEsame tipoEsame = new TipologiaEsame(nome, codice, descrizione, prezzo, prerequisito);
		em.persist(tipoEsame);
		return tipoEsame;
	}

	public TipologiaEsame getTipologiaEsame(Long id) {
		TipologiaEsame tipoEsame = em.find(TipologiaEsame.class, id);
		return tipoEsame;
	}

	public List<TipologiaEsame> trovaTutteTipologie() {
		CriteriaQuery<TipologiaEsame> cq = em.getCriteriaBuilder().createQuery(TipologiaEsame.class);
		cq.select(cq.from(TipologiaEsame.class));
		List<TipologiaEsame> tipoEsame = em.createQuery(cq).getResultList();
		return tipoEsame;
	}

	public void updateTipologiaEsame(TipologiaEsame tipoEsame) {
		em.merge(tipoEsame);
	}

	public void deleteTipologiaEsame(TipologiaEsame tipoEsame) {
		em.remove(tipoEsame);
	}
	
	public void deleteTipologiaEsame(Long id) {
		TipologiaEsame tipologiaEsame = em.find(TipologiaEsame.class, id);
		deleteTipologiaEsame(tipologiaEsame);
	}
}
