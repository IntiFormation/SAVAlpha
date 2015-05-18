package fr.adaming.models;

// Generated 18 mai 2015 13:37:21 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Enseignes generated by hbm2java
 */
@Entity
@Table(name = "enseignes", catalog = "dbprojet")
public class Enseignes implements java.io.Serializable {

	private int idEnseigne;
	private String nom;
	private Float versementMensuel;
	private Set vendeurses = new HashSet(0);

	public Enseignes() {
	}

	public Enseignes(int idEnseigne) {
		this.idEnseigne = idEnseigne;
	}

	public Enseignes(int idEnseigne, String nom, Float versementMensuel,
			Set vendeurses) {
		this.idEnseigne = idEnseigne;
		this.nom = nom;
		this.versementMensuel = versementMensuel;
		this.vendeurses = vendeurses;
	}

	@Id
	@Column(name = "id_enseigne", unique = true, nullable = false)
	public int getIdEnseigne() {
		return this.idEnseigne;
	}

	public void setIdEnseigne(int idEnseigne) {
		this.idEnseigne = idEnseigne;
	}

	@Column(name = "nom", length = 254)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "versementMensuel", precision = 12, scale = 0)
	public Float getVersementMensuel() {
		return this.versementMensuel;
	}

	public void setVersementMensuel(Float versementMensuel) {
		this.versementMensuel = versementMensuel;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "enseignes")
	public Set getVendeurses() {
		return this.vendeurses;
	}

	public void setVendeurses(Set vendeurses) {
		this.vendeurses = vendeurses;
	}

}