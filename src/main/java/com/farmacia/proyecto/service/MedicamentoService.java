/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.farmacia.proyecto.service;

import com.farmacia.proyecto.model.Medicamento;
import com.farmacia.proyecto.model.Usuario;
import java.util.List;

/**
 *
 * @author mota1
 */
public interface MedicamentoService {
    public List<Medicamento> findAll();
    public Medicamento save(Medicamento medicamento);
    public Medicamento findById(Integer id);
    public void delete(Integer id);
}
