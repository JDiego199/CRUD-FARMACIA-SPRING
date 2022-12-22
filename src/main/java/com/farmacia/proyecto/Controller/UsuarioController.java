/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.proyecto.Controller;

import com.farmacia.proyecto.model.Usuario;
import com.farmacia.proyecto.service.UsuarioService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mota1
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/")
@RequiredArgsConstructor
public class UsuarioController {
    
      @Autowired
    public UsuarioService usuarioService;

    //Guardar
    @PostMapping("/Usuario")
    public Usuario guardar(@RequestBody Usuario usuario) {

        return usuarioService.save(usuario);
    }

    //listar
    @GetMapping("/usuario")
    public List<Usuario> listar() {
        return usuarioService.findAll();
    }

    @DeleteMapping("/usuario/{id}")
    public void eliminar(@PathVariable Integer id) {
        usuarioService.delete(id);
    }

    //get una cuenta
    @GetMapping("/usuario/{id}")
    public Usuario buscarPorId(@PathVariable Integer id) {
        return usuarioService.findById(id);
    }

    @PutMapping("/usuario/{id}")
    public Usuario modificar(@RequestBody Usuario usuario, @PathVariable Integer id) {

        Usuario usuarioActual = usuarioService.findById(id);
        usuarioActual.setNombre(usuario.getNombre());
        usuarioActual.setCedula(usuario.getCedula());
        usuarioActual.setTelefono(usuario.getTelefono());
        usuarioActual.setDiagnostico(usuario.getDiagnostico());
        return usuarioService.save(usuarioActual);
    }

    
}
