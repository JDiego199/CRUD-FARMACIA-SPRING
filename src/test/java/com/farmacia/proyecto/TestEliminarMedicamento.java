/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.proyecto;

import com.farmacia.proyecto.model.Medicamento;
import com.farmacia.proyecto.service.MedicamentoService;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author mota1
 */
@SpringBootTest
public class TestEliminarMedicamento {
    
        @Test
    public void EliminarMedicamento() {

        Medicamento medicamento = new Medicamento();

        medicamento.setCantidad(223);
        medicamento.setContenido("tabletas");
        medicamento.setNombreMe("Certal");
        medicamento.setEstado("solido");
        
      
        MedicamentoService medicamentoService = mock(MedicamentoService.class);
        
        medicamentoService.save(medicamento);
     
          medicamentoService.delete(1);
          
         when(medicamentoService.findAll()).thenReturn(Arrays.asList());
            assertNull(medicamentoService.findById(1));
        

    }
}
