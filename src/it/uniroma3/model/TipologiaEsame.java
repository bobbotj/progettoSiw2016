package it.uniroma3.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name = "trovaTutteTipologie", query = "SELECT t FROM TipologiaEsame t")
public class TipologiaEsame {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(unique = true, nullable = false)
	private String codice;

	@Column(length = 500)
	private String descrizione;

	@Column(nullable = false)
	private Float prezzo;
	
	@Column(length = 500)
	private String prerequisito;
	
	@OneToMany(mappedBy = "tipo")
	private List<Esame> esami;
	
	public TipologiaEsame() {
		
	}
	
	public TipologiaEsame(String nome, String codice, String descrizione, Float prezzo, String prerequisito) {
		this.nome = nome;
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.prerequisito = prerequisito;
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

	public String getPrerequisito() {
		return prerequisito;
	}

	public void setPrerequisito(String prerequisito) {
		this.prerequisito = prerequisito;
	}
	
	public List<Esame> getEsami() {
		return esami;
	}

	public void setEsami(List<Esame> esami) {
		this.esami = esami;
	}
	
	public boolean equals(Object obj) {
		TipologiaEsame tipologiaEsame = (TipologiaEsame)obj;
		return this.getCodice().equals(tipologiaEsame.getCodice());
	}

	public int hashCode() {
		return this.codice.hashCode();
	}

}
