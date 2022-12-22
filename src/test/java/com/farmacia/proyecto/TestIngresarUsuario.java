/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.proyecto;

import com.farmacia.proyecto.model.Usuario;
import com.farmacia.proyecto.service.UsuarioService;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author mota1
 */
@SpringBootTest
public class TestIngresarUsuario {
    
    	@Test
	public void IngresarUsuario() {
            
            Usuario usuario = new Usuario();
           
            usuario.setCedula(23123);
            usuario.setNombre("Diego");
            usuario.setDiagnostico("Dolor de cabeza");
            usuario.setTelefono("0981320526");
    
            
            UsuarioService usuarioService = mock(UsuarioService.class);
            
            when(usuarioService.findAll()).thenReturn(Arrays.asList(usuario));
            assertNotNull(usuarioService.findAll());
            
        }
    
}

