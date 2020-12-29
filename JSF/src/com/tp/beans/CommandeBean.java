package com.tp.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.tp.entities.Commande;


@ManagedBean
@SessionScoped
public class CommandeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Commande commande;
	private List<Commande> infos;
	
	public CommandeBean() {
		commande = new Commande();
		infos = new ArrayList<Commande>();
    }
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public List<Commande> getInfos() {
		return infos;
	}
	public void setInfos(List<Commande> infos) {
		this.infos = infos;
	}
	public void save() {
		infos.add(commande);
		commande = new Commande();
	}
}
