/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.programacionestructurada;

import java.util.Scanner;

/**
 *
 * @Marjorie Chimbo
 */
public class ProgramacionEstructurada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un valor: ");
        int valor = scanner.nextInt();

        if (valor > 0) {
            System.out.println("¡Se ha recibido un valor positivo!");
        } else {
            System.out.println("️Valor no válido o negativo.");
        }

        scanner.close();
    }
}
