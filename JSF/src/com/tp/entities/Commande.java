package com.tp.entities;

import java.util.Date;

public class Commande {

	private Date date;
	private Double montant;
	private String mode_paiement;
	private String statut_paiement;
	private String mode_livraison;
	private String statut_livraison;
	
	public Commande() {}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public String getMode_paiement() {
		return mode_paiement;
	}
	public void setMode_paiement(String mode_paiement) {
		this.mode_paiement = mode_paiement;
	}
	public String getStatut_paiement() {
		return statut_paiement;
	}
	public void setStatut_paiement(String statut_paiement) {
		this.statut_paiement = statut_paiement;
	}
	public String getMode_livraison() {
		return mode_livraison;
	}
	public void setMode_livraison(String mode_livraison) {
		this.mode_livraison = mode_livraison;
	}
	public String getStatut_livraison() {
		return statut_livraison;
	}
	public void setStatut_livraison(String statut_livraison) {
		this.statut_livraison = statut_livraison;
	}
}
