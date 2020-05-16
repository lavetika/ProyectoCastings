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
import objetoNegocio.Prueba;

/**
 *
 * @author laura
 */
public class DaoPrueba extends DaoBase<Prueba> {

    /**
     * Método implementado de la clase BaseRepository para guardar una Prueba
     *
     * @param prueba
     * @return
     */
    @Override
    public boolean guardar(Prueba prueba) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        if (prueba != null) {
            entityManager.persist(prueba);
        } else {
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para eliminar una Prueba
     * por id
     *
     * @param id
     */
    @Override
    public boolean eliminar(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Prueba prueba = entityManager.find(Prueba.class, id);
        if (prueba != null) {
            entityManager.remove(prueba);
        }else{
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para actualizar una Prueba
     *
     * @param pruebaActualizada
     */
    @Override
    public boolean actualizar(Prueba pruebaActualizada) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Prueba prueba = entityManager.find(Prueba.class, pruebaActualizada.getId());
        if (prueba != null) {
            prueba.setCasting(pruebaActualizada.getCasting());
            prueba.setDescripcion(pruebaActualizada.getDescripcion());
            prueba.setFase(pruebaActualizada.getFase());
            prueba.setFecha(pruebaActualizada.getFecha());
            prueba.setNumSala(pruebaActualizada.getNumSala());
            entityManager.merge(prueba);
        }else{
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar una Prueba en
     * especifico por id
     *
     * @param id
     * @return
     */
    @Override
    public Prueba buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Prueba prueba = entityManager.find(Prueba.class, id);
        entityManager.getTransaction().commit();
        return prueba;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar todas las
     * Pruebas y que regresa un ArrayList con ellos
     *
     * @return
     */
    @Override
    public ArrayList<Prueba> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Prueba.class));
        Query query = entityManager.createQuery(criteria);
        List<Prueba> pruebas = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(pruebas);
    }
}
