package it.uniroma3.controller;

import java.util.List;

import it.uniroma3.model.Medico;
import it.uniroma3.model.MedicoFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class MedicoController {

	@ManagedProperty(value = "#{param.id}")
	public Long id;
	public String nome;
	public String cognome;
	public String password;
	private String specializzazione;
	private Medico medico;
	private List<Medico> medici;

	@EJB
	private MedicoFacade medicoFacade;

	public String createMedico() {
		this.medico = medicoFacade.createMedico(nome, cognome, specializzazione, password);
		return "schedaMedico.jsp"; 
	}

	public String listMedici() {
		this.medici = medicoFacade.trovaTuttiMedici();
		return "medici"; 
	}

	public String findMedico(String nome, String cognome) {
		this.medico = medicoFacade.getMedico(id);
		if(this.medico.getNome().equals(nome) && this.medico.getCognome().equals(cognome))
			return "schedaMedico";
		else
			return "error";
	}
	public String findMedico() {
		this.medico = medicoFacade.getMedico(id);
		return "schedaMedico";
	}

	public String findMedico(Long id) {
		this.medico = medicoFacade.getMedico(id);
		return "schedaMedico";
	}

	public String verificaCredenziali(String cognome, String password) {
		this.medico = medicoFacade.getMedico(id);
		if(this.medico.getCognome().equals(cognome) && this.medico.getPassword().equals(password))
			return "schedaMedico";
		else
			return "error";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getSpecializzazione() {
		return specializzazione;
	}

	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}

	public List<Medico> getMedici() {
		return medici;
	}

	public void setMedici(List<Medico> medici) {
		this.medici = medici;
	}

}
