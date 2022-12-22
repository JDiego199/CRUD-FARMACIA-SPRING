/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.proyecto.service;

import com.farmacia.proyecto.model.Medicamento;

import com.farmacia.proyecto.repository.MedicamentoRepository;

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
public class MedicamentoServiceImpl implements MedicamentoService {

    @Autowired
    private final MedicamentoRepository medicamentoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Medicamento> findAll() {
        return (List<Medicamento>) medicamentoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Medicamento save(Medicamento medicamento) {

        return medicamentoRepository.save(medicamento);
    }

    @Override
    @Transactional(readOnly = true)
    public Medicamento findById(Integer id) {
        return medicamentoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        medicamentoRepository.deleteById(id);
    }
}
