package it.uniroma3.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(name = "trovaTuttiEsami", query = "SELECT e FROM Esame e")
public class Esame {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String codice;
	
	@Column(nullable = false)
	private String nome;

	@Temporal (TemporalType.TIMESTAMP)
	private Date dataCreazione;

	@Temporal (TemporalType.DATE)
	private Date dataEsecuzione;

	@ManyToOne
	@JoinColumn(name = "nome_tipo")
	private TipologiaEsame tipo;

	@ManyToOne    
	@JoinColumn(name = "id_paziente")
	private Paziente paziente;

	@ManyToOne    
	@JoinColumn(name = "id_medico")
	private Medico medico;

	public Esame() {
		this.dataCreazione = new Date();
	}

	public Esame(String nome, String codice, TipologiaEsame tipo) {
		this.dataCreazione = new Date();
		this.nome = nome;
		this.codice = codice;
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public TipologiaEsame getTipo() {
		return tipo;
	}

	public void setTipologia(TipologiaEsame tipo) {
		this.tipo = tipo;
	}

	
	public Date getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}

	public Paziente getPaziente() {
		return paziente;
	}

	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}

	public void setTipo(TipologiaEsame tipo) {
		this.tipo = tipo;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Date getDataEsecuzione() {
		return dataEsecuzione;
	}

	public void setDataEsecuzione(Date dataEsecuzione) {
		this.dataEsecuzione = dataEsecuzione;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

}
