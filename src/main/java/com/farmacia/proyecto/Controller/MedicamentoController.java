/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.proyecto.Controller;

import com.farmacia.proyecto.model.Medicamento;
import com.farmacia.proyecto.model.Usuario;
import com.farmacia.proyecto.service.MedicamentoService;
import com.farmacia.proyecto.service.UsuarioService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
public class MedicamentoController {
      
      @Autowired
    public MedicamentoService medicamentoService;

    //Guardar
    @PostMapping("/medicamento")
    public Medicamento guardar(@RequestBody Medicamento medicamento) {

        return medicamentoService.save(medicamento);
    }

    //listar
    @GetMapping("/medicamento")
    public List<Medicamento> listar() {
        return medicamentoService.findAll();
    }

    @DeleteMapping("/medicamento/{id}")
    public void eliminar(@PathVariable Integer id) {
        medicamentoService.delete(id);
    }

    //get una cuenta
    @GetMapping("/medicamento/{id}")
    public Medicamento buscarPorId(@PathVariable Integer id) {
        return medicamentoService.findById(id);
    }

    @PutMapping("/medicamento/{id}")
    public Medicamento modificar(@RequestBody Medicamento medicamento, @PathVariable Integer id) {

        Medicamento medicamentoActual = medicamentoService.findById(id);
        medicamentoActual.setNombreMe(medicamento.getNombreMe());
        medicamentoActual.setCantidad(medicamento.getCantidad());
        medicamentoActual.setEstado(medicamento.getEstado());
        medicamentoActual.setContenido(medicamento.getContenido());
        
        return medicamentoService.save(medicamentoActual);
    }

}
