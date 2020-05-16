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
import objetoNegocio.Cliente;

/**
 *
 * @author laura
 */
public class DaoCliente extends DaoBase<Cliente>{
    /**
     * Método implementado de la clase BaseRepository para guardar un Cliente
     * @param cliente  
     */
    @Override
    public boolean guardar(Cliente cliente) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();        
        if(cliente!=null){
        entityManager.persist(cliente);
        }else{
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para eliminar un Cliente 
     * por id
     * @param id 
     * @return  
     */
    @Override
    public boolean eliminar(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        AgenteCasting agenteCasting = entityManager.find(AgenteCasting.class, id);
        if(agenteCasting != null){
            entityManager.remove(agenteCasting);
        }else{
            return false;
        }        
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para actualizar un Cliente
     * @param clienteActualizado 
     */
    @Override
    public boolean actualizar(Cliente clienteActualizado) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Cliente cliente = entityManager.find(Cliente.class, clienteActualizado.getId());
        if(cliente != null){
            cliente.setNombre(clienteActualizado.getNombre());
            cliente.setActividad(clienteActualizado.getActividad());
            cliente.setDireccion(clienteActualizado.getDireccion());
            cliente.setCastings(clienteActualizado.getCastings());
            cliente.setCodigo(clienteActualizado.getCodigo());
            cliente.setContacto(clienteActualizado.getContacto());
            cliente.setTelefono(clienteActualizado.getTelefono());
            entityManager.merge(cliente);
        }else{
            return false;
        }
        entityManager.getTransaction().commit();
        return true;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar un Cliente
     * en especifico por id
     * @param id
     * @return 
     */
    @Override
    public Cliente buscarPorId(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Cliente cliente = entityManager.find(Cliente.class, id);
        entityManager.getTransaction().commit();
        return cliente;
    }

    /**
     * Método implementado de la clase BaseRepository para buscar todas los Clientes
     * y que regresa un ArrayList con ellos
     * @return 
     */
    @Override
    public ArrayList<Cliente> buscarTodas() {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        CriteriaQuery criteria = entityManager.getCriteriaBuilder().createQuery();
        criteria.select(criteria.from(Cliente.class));
        Query query = entityManager.createQuery(criteria);
        List<Cliente> cliente = query.getResultList();
        entityManager.getTransaction().commit();
        return new ArrayList<>(cliente);
    }
}
