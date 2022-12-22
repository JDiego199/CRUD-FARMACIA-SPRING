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
@Table (name = "Usuario")
public class Usuario {
    
    	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    @Column(name = "Nombre", nullable = false)
	private String nombre;
    @Column(name = "Cedula", nullable = false)
	private float cedula;
    @Column(name = "Telefono", nullable = false)
	private String telefono;
    @Column(name = "Diagnostico", nullable = false)
	private String diagnostico;

    public Usuario(String nombre, float cedula, String telefono, String diagnostico) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", diagnostico=" + diagnostico + '}';
    }




    
    
}
