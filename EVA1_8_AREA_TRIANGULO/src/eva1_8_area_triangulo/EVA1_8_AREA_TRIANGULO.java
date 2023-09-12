/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_area_triangulo;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA1_8_AREA_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // double ---> tipo de dato para  numeros cono parte decimal
        double base;
        double altura;
        double area;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la base del triangulo");
        base = captu.nextDouble();
        System.out.println("Introduce la altura del triangulo");
        altura = captu.nextDouble();
        area = (base*altura)/2;
        System.out.println("El area del triangulo es:");
        System.out.println(area);
    }
    
}
