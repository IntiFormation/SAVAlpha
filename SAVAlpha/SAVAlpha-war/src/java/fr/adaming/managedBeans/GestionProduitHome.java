/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.managedBeans;

import fr.adaming.dao.ProduitsFacadeLocal;
import fr.adaming.models.Produits;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author User
 */
@ManagedBean
@SessionScoped
public class GestionProduitHome implements Serializable{
    
    List<Produits> listProd;
    List<String> categories = new ArrayList<>();
    List<String> marques = new ArrayList<>();
    List<String> modeles = new ArrayList<>();
    
    
    @EJB
    private ProduitsFacadeLocal produitsFacade;
    
    public GestionProduitHome() {
        categories.add("Informatique");
        categories.add("Hi fi");
        
        marques.add("hp");
        marques.add("Aser");
        marques.add("Sony");
        marques.add("Yamaha");
        
        modeles.add("Ordinateur");
        modeles.add("Souris");
        modeles.add("Chaine hi fi");
        modeles.add("Enceinte");
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<String> getMarques() {
        return marques;
    }

    public void setMarques(List<String> marques) {
        this.marques = marques;
    }

    public List<String> getModeles() {
        return modeles;
    }

    public void setModeles(List<String> modeles) {
        this.modeles = modeles;
    }
    
    public List<Produits> getProd(){
        
        return produitsFacade.findAll();
    }
    
}
