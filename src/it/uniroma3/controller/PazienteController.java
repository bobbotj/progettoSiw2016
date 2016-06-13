package it.uniroma3.controller;

import java.util.List;

import it.uniroma3.model.Paziente;
import it.uniroma3.model.PazienteFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class PazienteController {

	@ManagedProperty(value = "#{param.id}")
	public Long id;
	public String nome;
	public String cognome;
	public String password;
	private Paziente paziente;
	private List<Paziente> pazienti;

	@EJB
	private PazienteFacade pazienteFacade;

	public String createPaziente() {
		this.paziente = pazienteFacade.createPaziente(nome, cognome, password);
		return "schedaPaziente"; 
	}

	public String listPazienti() {
		this.pazienti = pazienteFacade.trovaTuttiPazienti();
		return "pazienti"; 
	}

	public String findPaziente() {
		this.paziente = pazienteFacade.getPaziente(id);
		return "paziente";
	}
	
	public String verificaCredenziali(String cognome, String password) {
		this.paziente = pazienteFacade.getPaziente(id);

		if(this.paziente.getCognome() == cognome && this.paziente.getPassword() == password)
			return "paziente";
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
	
	public Paziente getPaziente() {
		return paziente;
	}

	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}

	public List<Paziente> getPazienti() {
		return pazienti;
	}

	public void setPazienti(List<Paziente> pazienti) {
		this.pazienti = pazienti;
	}

}
