package it.uniroma3.controller;

import java.util.List;

import it.uniroma3.model.TipologiaEsame;
import it.uniroma3.model.TipologiaEsameFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class TipologiaEsameController {

	@ManagedProperty(value = "#{param.id}")
	private Long id;
	private String nome;
	private String codice;
	private String descrizione;
	private String prerequisito;
	private Float prezzo;
	private TipologiaEsame tipologiaEsame;
	private List<TipologiaEsame> tipologieEsame;
	
	@EJB
	private TipologiaEsameFacade tipologiaEsameFacade;
	
	public String createTipologiaEsame() {
		this.tipologiaEsame = tipologiaEsameFacade.createTipologiaEsame(nome, codice, descrizione, prezzo, prerequisito);
		return "tipologiaEsame"; 
	}
	
	public String listTipologie() {
		this.tipologieEsame = tipologiaEsameFacade.trovaTutteTipologie();
		return "tipologieEsame"; 
	}

	public String findTipologiaEsame() {
		this.tipologiaEsame = tipologiaEsameFacade.getTipologiaEsame(id);
		return "tipologiaEsame";
	}
	
	public String findTipologiaEsame(Long id) {
		this.tipologiaEsame = tipologiaEsameFacade.getTipologiaEsame(id);
		return "tipologiaEsame";
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

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}

	public TipologiaEsame getTipologiaEsame() {
		return tipologiaEsame;
	}

	public void setTipologiaEsame(TipologiaEsame tipologiaEsame) {
		this.tipologiaEsame = tipologiaEsame;
	}

	public List<TipologiaEsame> getTipologieEsame() {
		return tipologieEsame;
	}

	public void setTipologieEsame(List<TipologiaEsame> tipologieEsame) {
		this.tipologieEsame = tipologieEsame;
	}

	public String getPrerequisito() {
		return prerequisito;
	}

	public void setPrerequisito(String prerequisito) {
		this.prerequisito = prerequisito;
	}
	
}
