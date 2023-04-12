/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author iz-living
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
        (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay
        en la cafetera). Agregar constructor vacío y con parámetros así como setters y getters. 
        Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir a taza con la capacidad indicada. 
        Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
        El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.*/

        CafeteraServicio cafetera1 = new CafeteraServicio();

        Cafetera Nespresso = cafetera1.llenarCafetera();
        Scanner leer = new Scanner(System.in);
        int opc;

        do {

            do {

                System.out.println("Seleccione una opcion:");
                System.out.println("1. Llenar cafetera");
                System.out.println("2. Servir Taza");
                System.out.println("3. Vaciar cafetera");
                System.out.println("4. Agregar Café");
                System.out.println("5. Salir");

                opc = leer.nextInt();

                switch (opc) {
                    case 1:
                        cafetera1.llenarCafetera();
                        break;
                    case 2:
                        cuenta1.retirarDinero(cuentaGold);
                        break;
                    case 3:
                        cuenta1.extraccionRapida(cuentaGold);
                        break;
                    case 4:
                        cuenta1.consultarSaldo(cuentaGold);
                        break;
                    case 5:
                        System.out.println("Buenas Tardes");
                        break;

                }
            } while (opc != 5);

        } while (true);

    }

}