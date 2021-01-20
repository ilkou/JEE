package com.ensak.dao;

public class Client {
	private int numero;
	private String nom;
	private String ville;
	
	public Client() {
		//super();
	}
	
	public Client(int numero, String nom, String ville) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.ville = ville;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
}
