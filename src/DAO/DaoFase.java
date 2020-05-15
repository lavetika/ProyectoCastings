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
import objetoNegocio.Fase;

/**
 *
 * @author laura
 */
public class DaoFase extends DaoBase<Fase>{
    /**
     * Método implementado de la clase BaseRepository para guardar una Fase
     * @param fase  
     */
    @Override
    public void guardar(Fase fase) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();        
        entityManager.persist(fase);
        entityManager.getTransaction().commit();
    }

    /**
     * Método implementado de la clase BaseRepository para eliminar una Fase
     * por id
     * @param id 
     */
    @Override
    public void eliminar(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Fase fase = entityManager.find(Fase.class, id);
        if(fase != null){
            entityManager.remove(fase);
        }        
        entityManager.getTransaction().commit();
    }

    /**
     * Método implementado de la clase BaseRepository para actualizar una Fase
     * @param faseActualizada 
     */
    @Override
    public void actualizar(Fase faseActualizada) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Fase fase = entityManager.find(Fase.class, faseActualizada.getId());
        if(fase != null){
            fase.setCastingPresencial(faseActualizada.getCastingPresencial());
            fase.setNumPrueba(faseActualizada.getNumPrueba());
            fase.setPrueba(faseActualizada.getPrueba());
            entityManager.merge(fase);
        }
        entityManager.getTransaction().commit();
    }

    /**
     * Método implementado de la clase BaseRepository para buscar una Fase
     * en especifico por id
     * @param id
     * @return 
     */
    @Override
    public Fase buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Fase fase = entityManager.find(Fase.class, id);
        entityManager.getTransaction().commit();
        return fase;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar todas las Fases
     * y que regresa un ArrayList con ellos
     * @return 
     */
    @Override
    public ArrayList<Fase> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Fase.class));
        Query query = entityManager.createQuery(criteria);
        List<Fase> fases = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(fases);
    }
}
