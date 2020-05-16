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
import objetoNegocio.Casting;
import objetoNegocio.Casting_;

/**
 *
 * @author laura
 */
public class DaoCasting extends DaoBase<Casting> {

    /**
     * Método implementado de la clase BaseRepository para guardar un Casting
     *
     * @param casting
     * @return 
     */
    @Override
    public boolean guardar(Casting casting) {
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
     * Método implementado de la clase BaseRepository para eliminar un Casting
     * por id
     *
     * @param id
     * @return 
     */
    @Override
    public boolean eliminar(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Casting casting = entityManager.find(Casting.class, id);
        if (casting != null) {
            entityManager.remove(casting);
        } else {
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para actualizar un Casting
     * @param castingActualizado 
     * @return  
     */
    @Override
    public boolean actualizar(Casting castingActualizado) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Casting casting = entityManager.find(Casting.class, castingActualizado.getId());
        if (casting != null) {
            casting.setNombre(castingActualizado.getNombre());
            casting.setCanditatos(castingActualizado.getCanditatos());
            casting.setCliente(castingActualizado.getCliente());
            casting.setCodigo(castingActualizado.getCodigo());
            casting.setDescripcion(castingActualizado.getDescripcion());
            casting.setFecha(castingActualizado.getFecha());
            casting.setPruebas(castingActualizado.getPruebas());
            entityManager.merge(casting);
        } else {
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar un Casting en
     * especifico por id
     *
     * @param id
     * @return
     */
    @Override
    public Casting buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Casting casting = entityManager.find(Casting.class, id);
        if (casting != null) {
            entityManager.getTransaction().commit();
            return casting;
        }
        entityManager.getTransaction().commit();
        return null;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar todas los
     * Castings y que regresa un ArrayList con ellos
     *
     * @return
     */
    @Override
    public ArrayList<Casting> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Casting.class));
        Query query = entityManager.createQuery(criteria);
        List<Casting> castings = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(castings);
    }
}
