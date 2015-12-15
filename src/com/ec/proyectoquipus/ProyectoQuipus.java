/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.proyectoquipus;

import com.ec.entidades.DetalleRubro;
import com.ec.entidades.Usuario;
import com.ec.servicios.DetalleRubroJpaController;
import com.ec.servicios.HelperPersistencia;
import com.ec.servicios.UsuarioJpaController;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Cchristico
 */
public class ProyectoQuipus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        HelperPersistencia help = new HelperPersistencia();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoQuipusPU");
        UsuarioJpaController controller = new UsuarioJpaController();

        for (Usuario item : controller.findUsuarioEntities()) {
            System.out.println("valores " + item.getNombreUsuario());
            item.setCedulaUsuario("9999999999");
            controller.edit(item);
        }

//        Usuario usuario= new Usuario(2, "Prueba", "Contraseña");
//        controller.create(usuario);
    }

}
