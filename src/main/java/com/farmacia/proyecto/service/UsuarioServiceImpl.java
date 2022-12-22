/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.proyecto.service;

import com.farmacia.proyecto.model.Usuario;
import com.farmacia.proyecto.repository.UsuarioRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mota1
 */
@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {
    
    
       @Autowired 
    private final UsuarioRepository usuarioRepository;
    
    @Override
    @Transactional(readOnly=true)
    public List<Usuario> findAll()
    {
    return (List<Usuario>) usuarioRepository.findAll();
    }
    
    @Override
       @Transactional(readOnly=false)
    public Usuario save( Usuario usuario){
    
        return usuarioRepository.save(usuario);
    }
    
    @Override
       @Transactional(readOnly=true)
    public Usuario findById(Integer id)
    {
        return usuarioRepository.findById(id).orElse(null);
    }
    
    @Override
       @Transactional(readOnly=false)
    public void delete(Integer id)
    {
        usuarioRepository.deleteById(id);
    }      
   
}
