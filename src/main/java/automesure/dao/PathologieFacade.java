/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automesure.dao;

import com.mycompany.automesure1.Pathologie;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Justin
 */
@Stateless
public class PathologieFacade extends AbstractFacade<Pathologie> {

    @PersistenceContext(unitName = "test")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PathologieFacade() {
        super(Pathologie.class);
    }
    
}
