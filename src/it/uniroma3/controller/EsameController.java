package it.uniroma3.controller;

import java.util.Date;
import java.util.List;

import it.uniroma3.model.Esame;
import it.uniroma3.model.EsameFacade;
import it.uniroma3.model.TipologiaEsame;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class EsameController {
	
	@ManagedProperty(value = "#{param.id}")
	private Long id;
	private String nome;
	private String codice;
	private Date dataCreazione;
	private Date dataEsecuzione;
	private TipologiaEsame tipo;
	private Esame esame;
	private List<Esame> esami;
	
	@EJB
	private EsameFacade esameFacade;
	
	public String createEsame() {
		this.esame = esameFacade.createEsame(nome, codice, tipo);
		return "esame"; 
	}
	
	public String listEsami() {
		this.esami = esameFacade.trovaTuttiEsami();
		return "esami"; 
	}

	public String findByCode(String codice) {
		this.esame = esameFacade.getEsame(id);
		if(this.esame.getCodice().equals(codice))
			return "esame";
		else
			return "esame non trovato!";
	}
	public String findEsame() {
		this.esame = esameFacade.getEsame(id);
		return "esame";
	}
	
	public String findEsame(Long id) {
		this.esame = esameFacade.getEsame(id);
		return "esame";
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

	public Date getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public Date getDataEsecuzione() {
		return dataEsecuzione;
	}

	public void setDataEsecuzione(Date dataEsecuzione) {
		this.dataEsecuzione = dataEsecuzione;
	}

	public TipologiaEsame getTipo() {
		return tipo;
	}

	public void setTipo(TipologiaEsame tipo) {
		this.tipo = tipo;
	}

	public Esame getEsame() {
		return esame;
	}

	public void setEsame(Esame esame) {
		this.esame = esame;
	}

	public List<Esame> getEsami() {
		return esami;
	}

	public void setEsami(List<Esame> esami) {
		this.esami = esami;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

}
