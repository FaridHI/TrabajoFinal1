/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajofinal;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class TrabajoFinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("¿Quieres jugar? (si/no)");
        String respuestajugar = scanner.nextLine();
        
        if (respuestajugar.equalsIgnoreCase("si")){
            System.out.println("¿Quieres jugar futbol o basketbol?");
            String respuestajuego = scanner.nextLine();
            
            if (respuestajuego.equalsIgnoreCase("futbol")){
                System.out.println("Vamos a jugar futbol");
            } else if (respuestajuego.equalsIgnoreCase("basketbol")){
                System.out.println("Vamos a juagr basketbol");
            } else {
                System.out.println("No es una opcion válida");
            }
        }
    }
}
