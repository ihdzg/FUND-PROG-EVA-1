/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_enttrada_salida;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA1_5_ENTTRADA_SALIDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
        //1. DECLARACION DE VARIABLES
        String nombre;
        String apellidos;
        int semestre;
        Scanner capturota = new Scanner(System.in);
        //; fin de instruccion en Java
        //2. CAPTURA DE VARIABLES
        System.out.println("Introduce tu nombre");
        nombre = capturota.nextLine();
        System.out.println("Introduce tu apellido");
        apellidos = capturota.nextLine();
        System.out.println("Introduce el semestre");
        semestre = capturota.nextInt ();
        //Java es sensible a mayusculas y minusculas
        //es decir: es diferente System que sistem
        //3. MOSTRAR LOS DATOS CAPTURADOS
        System.out.println("nombre");
        System.out.println("apellidos");
        System.out.println("semestre");
        
    }
    
}
