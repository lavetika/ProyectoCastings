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
import objetoNegocio.CandidatoNiño;

/**
 *
 * @author laura
 */
public class DaoCandidatoNiño extends DaoBase<CandidatoNiño>{
    /**
     * Método implementado de la clase BaseRepository para guardar un CandidatoNiño 
     * @param niño  
     * @return   
     */
    @Override
    public boolean guardar(CandidatoNiño niño) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();        
        
        if(niño!=null){
        entityManager.persist(niño);
        }else{
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para eliminar un CandidatoNiño
     * por id
     * @param id 
     * @return  
     */
    @Override
    public boolean eliminar(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CandidatoNiño niño = entityManager.find(CandidatoNiño.class, id);
        if(niño != null){
            entityManager.remove(niño);
        }else{
            return false;
        }        
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para actualizar un CandidatoNiño
     * @param niñoActualizado 
     * @return  
     */
    @Override
    public boolean actualizar(CandidatoNiño niñoActualizado) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CandidatoNiño niño = entityManager.find(CandidatoNiño.class, niñoActualizado.getId());
        if(niño != null){
            niño.setNombre(niñoActualizado.getNombre());
            niño.setCurp(niñoActualizado.getCurp());
            niño.setNombreTutor(niñoActualizado.getNombreTutor());
            niño.setEdad(niñoActualizado.getEdad());
            niño.setRepresentante(niñoActualizado.getRepresentante());
            entityManager.merge(niño);
        }else{
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar un CandidatoNiño
     * en especifico por id
     * @param id
     * @return 
     */
    @Override
    public CandidatoNiño buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CandidatoNiño niño = entityManager.find(CandidatoNiño.class, id);
        if(niño!=null){
        entityManager.getTransaction().commit();
        return niño;
        }
        entityManager.getTransaction().commit();
        return null;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar todas los CandidatoNiños
     * y que regresa un ArrayList con ellos
     * @return 
     */
    @Override
    public ArrayList<CandidatoNiño> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(CandidatoNiño.class));
        Query query = entityManager.createQuery(criteria);
        List<CandidatoNiño> niños = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(niños);
    }
}
