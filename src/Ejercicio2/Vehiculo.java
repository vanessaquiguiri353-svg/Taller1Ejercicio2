/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
public class Vehiculo {
    //Atributos
    String marca, modelo, estado;
    int anio_fab;
    boolean matriculado;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String estado, int anio_fab, boolean matriculado) {
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.anio_fab = anio_fab;
        this.matriculado = matriculado;
    }
    //Metodos
    public void revisionVehicular() {
        System.out.println("=== REVISION VEHICULAR ===");
        int anioActual = 2026;
        int antiguedad = anioActual - anio_fab;
        
        if (antiguedad > 30) {
            this.estado = "usado malo";
            System.out.println("El vehiculo supera los 30 anios de antiguedad. Estado actualizado a: " + this.estado);
        } else if (this.estado.equalsIgnoreCase("seminuevo")) {
            
            this.estado = "usado bueno";
            System.out.println("Calificacion de estado actualizada a: " + this.estado);
        } else {
            System.out.println("Revision completada. Mantiene su estado: " + this.estado);
        }
    }
    public void matricular() {
        if (!this.estado.equalsIgnoreCase("usado malo")) {
            this.matriculado = true; 
            System.out.println("Exito! El vehículo ha sido matriculado."); 
        } else {
            System.out.println("Error: No se puede matricular porque el estado es 'usado malo'.");
        }
    }
    public void mostrarDatos() {
        System.out.println("=== DATOS DEL VEHICULO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Estado: " + estado);
        System.out.println("Anio de Fabricacion: " + anio_fab);
        System.out.println("¿Matriculado?: " + (matriculado ? "Si" : "No"));
    }
}
    