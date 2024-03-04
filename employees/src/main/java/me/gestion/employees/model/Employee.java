package me.gestion.employees.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Nom;
	private String Prenom;
	private String Identifiant;
	private String Adress;
	private int Fonction;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, String nom, String prenom, String identifiant, String adress, int fonction) {
		super();
		this.id = id;
		Nom = nom;
		Prenom = prenom;
		Identifiant = identifiant;
		Adress = adress;
		Fonction = fonction;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getIdentifiant() {
		return Identifiant;
	}

	public void setIdentifiant(String identifiant) {
		Identifiant = identifiant;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public int getFonction() {
		return Fonction;
	}

	public void setFonction(int fonction) {
		Fonction = fonction;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Identifiant=" + Identifiant
				+ ", Adress=" + Adress + ", Fonction=" + Fonction + "]";
	}
	
}