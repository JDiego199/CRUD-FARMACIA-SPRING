/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.proyecto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author mota1
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (name = "medicamento")
public class Medicamento {
    
        	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    @Column(name = "NombreMe", nullable = false)
	private String nombreMe;
    @Column(name = "Cantidad", nullable = false)
	private float cantidad;
    @Column(name = "Contenido", nullable = false)
	private String contenido;
    @Column(name = "Estado", nullable = false)
	private String estado;

    public Medicamento(String nombreMe, float cantidad, String contenido, String estado) {
        this.nombreMe = nombreMe;
        this.cantidad = cantidad;
        this.contenido = contenido;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "id=" + id + ", nombreMe=" + nombreMe + ", cantidad=" + cantidad + ", contenido=" + contenido + ", estado=" + estado + '}';
    }
    
    
    
}
