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
import objetoNegocio.Representante;

/**
 *
 * @author laura
 */
public class DaoRepresentante extends DaoBase<Representante>{
    /**
     * Método implementado de la clase BaseRepository para guardar un Representante
     * @param representante  
     * @return   
     */
    @Override
    public boolean guardar(Representante representante) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();        
        if(representante!=null){
        entityManager.persist(representante);
        }else{
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para eliminar un Representante
     * por id
     * @param id 
     * @return  
     */
    @Override
    public boolean eliminar(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Representante representante = entityManager.find(Representante.class, id);
        if(representante != null){
            entityManager.remove(representante);
        }else{
            return false;
        }        
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para actualizar un Representante
     * @param representanteActualizado 
     * @return  
     */
    @Override
    public boolean actualizar(Representante representanteActualizado) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Representante representante = entityManager.find(Representante.class, representanteActualizado.getId());
        if(representante != null){
            representante.setNombre(representanteActualizado.getNombre());
            representante.setCurp(representanteActualizado.getCurp());
            representante.setDireccion(representanteActualizado.getDireccion());
            representante.setPerfiles(representanteActualizado.getPerfiles());
            representante.setRfc(representanteActualizado.getRfc());
            representante.setTelefono(representanteActualizado.getTelefono());
            entityManager.merge(representante);
        }else{
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar un Representante
     * en especifico por id
     * @param id
     * @return 
     */
    @Override
    public Representante buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Representante representante = entityManager.find(Representante.class, id);
        entityManager.getTransaction().commit();
        return representante;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar todas los Representantes
     * y que regresa un ArrayList con ellos
     * @return 
     */
    @Override
    public ArrayList<Representante> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Representante.class));
        Query query = entityManager.createQuery(criteria);
        List<Representante> representantes = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(representantes);
    }
}
