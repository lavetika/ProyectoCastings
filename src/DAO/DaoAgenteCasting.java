/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import objetoNegocio.AgenteCasting;

/**
 *
 * @author laura
 */
public class DaoAgenteCasting extends DaoBase<AgenteCasting>{
    
    /**
     * Método implementado de la clase BaseRepository para guardar un agente de casting
     * @param agente  
     */
    @Override
    public void guardar(AgenteCasting agente) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();        
        entityManager.persist(agente);
        entityManager.getTransaction().commit();
    }

    /**
     * Método implementado de la clase BaseRepository para eliminar un agente de casting
     * por id
     * @param id 
     */
    @Override
    public void eliminar(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        AgenteCasting agenteCasting = entityManager.find(AgenteCasting.class, id);
        if(agenteCasting != null){
            entityManager.remove(agenteCasting);
        }        
        entityManager.getTransaction().commit();
    }

    /**
     * Método implementado de la clase BaseRepository para actualizar un agente de casting
     * @param agenteActualizado 
     */
    @Override
    public void actualizar(AgenteCasting agenteActualizado) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        AgenteCasting agente = entityManager.find(AgenteCasting.class, agenteActualizado.getId());
        if(agente != null){
            agente.setNombre(agenteActualizado.getNombre());
            agente.setCurp(agenteActualizado.getCurp());
            agente.setDireccion(agenteActualizado.getDireccion());
            agente.setNumEmpleados(agenteActualizado.getNumEmpleados());
            agente.setRfc(agenteActualizado.getRfc());
            entityManager.merge(agente);
        }
        entityManager.getTransaction().commit();
    }

    /**
     * Método implementado de la clase BaseRepository para buscar un agente de casting
     * en especifico por id
     * @param id
     * @return 
     */
    @Override
    public AgenteCasting buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        AgenteCasting agente = entityManager.find(AgenteCasting.class, id);
        entityManager.getTransaction().commit();
        return agente;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar todas los agentes de casting
     * y que regresa un ArrayList con ellos
     * @return 
     */
    @Override
    public ArrayList<AgenteCasting> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(AgenteCasting.class));
        Query query = entityManager.createQuery(criteria);
        List<AgenteCasting> agentes = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(agentes);
    }
}
