package it.uniroma3.model;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public class PazienteFacade {

	@PersistenceContext(unitName = "progettoSiw")
	protected EntityManager em;
	
	public Paziente createPaziente(String nome, String cognome, String password) {
		Paziente paziente = new Paziente(nome, cognome, password);
		em.persist(paziente);
		return paziente;
	}

	public Paziente getPaziente(Long id) {
		Paziente paziente = em.find(Paziente.class, id);
		return paziente;
	}

	public List<Paziente> trovaTuttiPazienti() {
		CriteriaQuery<Paziente> cq = em.getCriteriaBuilder().createQuery(Paziente.class);
		cq.select(cq.from(Paziente.class));
		List<Paziente> pazienti = em.createQuery(cq).getResultList();
		return pazienti;
	}

	public void updatePaziente(Paziente paziente) {
		em.merge(paziente);
	}

	public void deletePaziente(Paziente paziente) {
		em.remove(paziente);
	}
	
	public void deletePaziente(Long id) {
		Paziente paziente = em.find(Paziente.class, id);
		deletePaziente(paziente);
	}
}
