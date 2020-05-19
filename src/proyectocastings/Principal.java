/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocastings;

import DAO.Control;
import Enum.Actividad;
import objetoNegocio.Cliente;

/**
 *
 * @author Estefanía Aguilar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Control control = new Control();
        Cliente cliente = new Cliente("123DR", "John Weak", "Las Vegas #1234", "6445026543", "Thanos", Actividad.Cine);
        control.getDaoCliente().guardar(cliente);
    }
    
}
