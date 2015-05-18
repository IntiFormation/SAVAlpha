package fr.adaming.models;

// Generated 18 mai 2015 13:37:21 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Vendeurs generated by hbm2java
 */
@Entity
@Table(name = "vendeurs", catalog = "dbprojet")
public class Vendeurs implements java.io.Serializable {

	private int idVendeur;
	private Adresses adresses;
	private Comptes comptes;
	private Enseignes enseignes;
	private String nom;
	private String mail;
	private Set vendGars = new HashSet(0);
	private Set cltProdGarVends = new HashSet(0);

	public Vendeurs() {
	}

	public Vendeurs(int idVendeur) {
		this.idVendeur = idVendeur;
	}

	public Vendeurs(int idVendeur, Adresses adresses, Comptes comptes,
			Enseignes enseignes, String nom, String mail, Set vendGars,
			Set cltProdGarVends) {
		this.idVendeur = idVendeur;
		this.adresses = adresses;
		this.comptes = comptes;
		this.enseignes = enseignes;
		this.nom = nom;
		this.mail = mail;
		this.vendGars = vendGars;
		this.cltProdGarVends = cltProdGarVends;
	}

	@Id
	@Column(name = "id_vendeur", unique = true, nullable = false)
	public int getIdVendeur() {
		return this.idVendeur;
	}

	public void setIdVendeur(int idVendeur) {
		this.idVendeur = idVendeur;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_adresse")
	public Adresses getAdresses() {
		return this.adresses;
	}

	public void setAdresses(Adresses adresses) {
		this.adresses = adresses;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_compte")
	public Comptes getComptes() {
		return this.comptes;
	}

	public void setComptes(Comptes comptes) {
		this.comptes = comptes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_enseigne")
	public Enseignes getEnseignes() {
		return this.enseignes;
	}

	public void setEnseignes(Enseignes enseignes) {
		this.enseignes = enseignes;
	}

	@Column(name = "nom", length = 254)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "mail", length = 254)
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vendeurs")
	public Set getVendGars() {
		return this.vendGars;
	}

	public void setVendGars(Set vendGars) {
		this.vendGars = vendGars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vendeurs")
	public Set getCltProdGarVends() {
		return this.cltProdGarVends;
	}

	public void setCltProdGarVends(Set cltProdGarVends) {
		this.cltProdGarVends = cltProdGarVends;
	}

}