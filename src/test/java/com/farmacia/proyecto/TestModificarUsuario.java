/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.proyecto;

import com.farmacia.proyecto.model.Usuario;
import com.farmacia.proyecto.service.UsuarioService;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author mota1
 */
@SpringBootTest
public class TestModificarUsuario {
    
      	@Test
	public void modificarUsuario() {
            
            Usuario usuario = new Usuario();
           
           usuario.setId(1);
            usuario.setCedula(23123);
            usuario.setNombre("Diego");
            usuario.setDiagnostico("Dolor de cabeza");
            usuario.setTelefono("0981320526");
            
            
            UsuarioService usuarioService = mock(UsuarioService.class);
   
           
            Usuario usuarioNu= usuario;
            
            usuarioNu.setNombre("juan");
            
 
           when(usuarioService.findById(1)).thenReturn(usuarioNu);
             assertEquals("juan", usuarioNu.getNombre());

            
            
        }
}
