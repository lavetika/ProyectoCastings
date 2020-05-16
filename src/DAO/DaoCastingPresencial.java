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
import objetoNegocio.CastingPresencial;

/**
 *
 * @author laura
 */
public class DaoCastingPresencial extends DaoBase<CastingPresencial> {

    /**
     * Método implementado de la clase BaseRepository para guardar un
     * CastingPresencial
     *
     * @param casting
     * @return
     */
    @Override
    public boolean guardar(CastingPresencial casting) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        if (casting != null) {
            entityManager.persist(casting);
        } else {
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para eliminar un
     * CastingPresencial por id
     *
     * @param id
     * @return
     */
    @Override
    public boolean eliminar(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CastingPresencial casting = entityManager.find(CastingPresencial.class, id);
        if (casting != null) {
            entityManager.remove(casting);
        } else {
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para actualizar un
     * CastingPresencial
     *
     * @param castingActualizado
     */
    @Override
    public boolean actualizar(CastingPresencial castingActualizado) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CastingPresencial casting = entityManager.find(CastingPresencial.class, castingActualizado.getId());
        if (casting != null) {
            //Clase padre
            casting.setNombre(castingActualizado.getNombre());
            casting.setCanditatos(castingActualizado.getCanditatos());
            casting.setCliente(castingActualizado.getCliente());
            casting.setCodigo(castingActualizado.getCodigo());
            casting.setDescripcion(castingActualizado.getDescripcion());
            casting.setFecha(castingActualizado.getFecha());
            casting.setPruebas(castingActualizado.getPruebas());
            //Clase hija
            casting.setNumFase(castingActualizado.getNumFase());
            casting.setNumPersonas(castingActualizado.getNumPersonas());
            casting.setFase(castingActualizado.getFase());
            entityManager.merge(casting);
        } else {
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar un
     * CastingPresencial en especifico por id
     *
     * @param id
     * @return
     */
    @Override
    public CastingPresencial buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CastingPresencial casting = entityManager.find(CastingPresencial.class, id);
        if (casting != null) {
            entityManager.getTransaction().commit();
            return casting;
        }
        entityManager.getTransaction().commit();
        return null;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar todas los
     * casting presenciales y que regresa un ArrayList con ellos
     *
     * @return
     */
    @Override
    public ArrayList<CastingPresencial> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(CastingPresencial.class));
        Query query = entityManager.createQuery(criteria);
        List<CastingPresencial> casting = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(casting);
    }
}
