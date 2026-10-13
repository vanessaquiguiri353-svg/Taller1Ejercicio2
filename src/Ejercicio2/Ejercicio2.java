/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        Vehiculo[] listaVehiculos = null;
        int n = 0;

        do {
            System.out.println("");
            System.out.println("---GESTION DE MATRICULACION VEHICULAR---");
            System.out.println("1. Ingresar N numero de vehiculos");
            System.out.println("2. Realizar Revision Vehicular");
            System.out.println("3. Matricular Vehiculos");
            System.out.println("4. Mostrar Datos de los Vehiculos");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("");
                    System.out.println("---REGISTRO DE VEHICULOS---");
                    System.out.print("Ingrese el numero de vehiculos (N) a registrar: ");
                    n = sc.nextInt();
                    sc.nextLine();

                    listaVehiculos = new Vehiculo[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println("--- Datos del Vehiculo " + (i + 1) + " ---");
                        System.out.print("Ingrese la marca: ");
                        String marca = sc.nextLine();

                        System.out.print("Ingrese el modelo: ");
                        String modelo = sc.nextLine();

                        System.out.print("Ingrese el estado (nuevo, seminuevo, usado bueno, usado malo): ");
                        String estado = sc.nextLine();

                        System.out.print("Ingrese el anio de fabricacion: ");
                        int anio_fab = sc.nextInt();
                        sc.nextLine();

                        // Se pasa 'false' por defecto para el atributo matriculado
                        listaVehiculos[i] = new Vehiculo(marca, modelo, estado, anio_fab, false);
                    }
                    System.out.println("Los " + n + " vehiculos han sido registrados con exito!");
                    break;

                case 2:
                    if (listaVehiculos != null) {
                        System.out.println("--- REVISION DE TODOS LOS VEHICULOS ---");
                        for (int i = 0; i < listaVehiculos.length; i++) {
                            System.out.println("\nVehiculo " + (i + 1) + ":");
                            listaVehiculos[i].revisionVehicular();
                        }
                    } else {
                        System.out.println("Error! Primero debe registrar los vehiculos (Opcion 1).");
                    }
                    break;

                case 3:
                    if (listaVehiculos != null) {
                        System.out.println("--- MATRICULACION DE TODOS LOS VEHICULOS ---");
                        for (int i = 0; i < listaVehiculos.length; i++) {
                            System.out.println("\nVehiculo " + (i + 1) + ":");
                            listaVehiculos[i].matricular();
                        }
                    } else {
                        System.out.println("Error! Primero debe registrar los vehiculos (Opcion 1).");
                    }
                    break;

                case 4:
                    if (listaVehiculos != null) {
                        System.out.println("--- MOSTRAR DATOS DE LOS VEHICULOS ---");
                        for (int i = 0; i < listaVehiculos.length; i++) {
                            listaVehiculos[i].mostrarDatos();
                        }
                    } else {
                        System.out.println("Error! Primero debe registrar los vehiculos (Opcion 1).");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida...!");
            }

        } while (op != 5);

        sc.close();
    }
}