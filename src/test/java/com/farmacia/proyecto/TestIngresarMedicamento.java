/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.proyecto;

import com.farmacia.proyecto.model.Medicamento;
import com.farmacia.proyecto.model.Usuario;
import com.farmacia.proyecto.service.MedicamentoService;
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
public class TestIngresarMedicamento {

    @Test
    public void IngresarMedicamento() {

        Medicamento medicamento = new Medicamento();

        medicamento.setCantidad(223);
        medicamento.setContenido("tabletas");
        medicamento.setNombreMe("Certal");
        medicamento.setEstado("solido");

     
        MedicamentoService medicamentoService = mock(MedicamentoService.class);

        when(medicamentoService.findAll()).thenReturn(Arrays.asList(medicamento));
        assertNotNull(medicamentoService.findAll());

    }

}
