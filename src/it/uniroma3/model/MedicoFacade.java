package it.uniroma3.model;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

@Stateless
public class MedicoFacade {
	
	@PersistenceContext(unitName = "progettoSiw")
	protected EntityManager em;
	
	public Medico createMedico(String nome, String cognome, String specializzazione, String password) {
		Medico medico = new Medico(nome, cognome, specializzazione, password);
		em.persist(medico);
		return medico;
	}
	
	public Medico getMedico(Long id) {
		Medico medico = em.find(Medico.class, id);
		return medico;
	}
	
	public List<Medico> trovaTuttiMedici() {
		CriteriaQuery<Medico> cq = em.getCriteriaBuilder().createQuery(Medico.class);
		cq.select(cq.from(Medico.class));
		List<Medico> medici = em.createQuery(cq).getResultList();
		return medici;
	}
	
	public void updateMedico(Medico medico) {
		em.merge(medico);
	}
	
	public void deleteMedico(Medico medico) {
		em.remove(medico);
	}
	
	public void deleteMedico(Long id) {
		Medico medico = em.find(Medico.class, id);
		deleteMedico(medico);
	}
	
	

}
