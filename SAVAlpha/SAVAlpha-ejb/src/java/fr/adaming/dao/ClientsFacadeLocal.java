/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.dao;

import fr.adaming.models.Clients;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author INTI-0214
 */
@Local
public interface ClientsFacadeLocal {

    void create(Clients clients);

    void edit(Clients clients);

    void remove(Clients clients);

    Clients find(Object id);

    List<Clients> findAll();

    List<Clients> findRange(int[] range);

    int count();
    
}
