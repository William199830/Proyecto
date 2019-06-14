/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entidades.EvaluacionDeSatisfaccion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author William Moreno
 */
@Stateless
public class EvaluacionDeSatisfaccionFacade extends AbstractFacade<EvaluacionDeSatisfaccion> {

    @PersistenceContext(unitName = "ProyectoGPEDPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EvaluacionDeSatisfaccionFacade() {
        super(EvaluacionDeSatisfaccion.class);
    }
    
}
