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
import objetoNegocio.Perfil;

/**
 *
 * @author laura
 */
public class DaoPerfil extends DaoBase<Perfil>{
    /**
     * Método implementado de la clase BaseRepository para guardar un Perfil
     * @param perfil  
     * @return   
     */
    @Override
    public boolean guardar(Perfil perfil) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();        
        if(perfil!=null){
        entityManager.persist(perfil);
        }else{
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para eliminar un Perfil
     * por id
     * @param id 
     * @return  
     */
    @Override
    public boolean eliminar(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Perfil perfil = entityManager.find(Perfil.class, id);
        if(perfil != null){
            entityManager.remove(perfil);
        }else{
            return false;
        }        
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para actualizar un Perfil
     * @param perfilActualizado 
     */
    @Override
    public boolean actualizar(Perfil perfilActualizado) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Perfil perfil = entityManager.find(Perfil.class, perfilActualizado.getId());
        if(perfil != null){
            perfil.setNombre(perfilActualizado.getNombre());
            perfil.setCurp(perfilActualizado.getCurp());
            perfil.setEdad(perfilActualizado.getEdad());
            perfil.setRepresentante(perfilActualizado.getRepresentante());
            entityManager.merge(perfil);
        }else{
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar un Perfil
     * en especifico por id
     * @param id
     * @return 
     */
    @Override
    public Perfil buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Perfil perfil = entityManager.find(Perfil.class, id);
        entityManager.getTransaction().commit();
        return perfil;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar todas los Perfiles
     * y que regresa un ArrayList con ellos
     * @return 
     */
    @Override
    public ArrayList<Perfil> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Perfil.class));
        Query query = entityManager.createQuery(criteria);
        List<Perfil> perfiles = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(perfiles);
    }
}
