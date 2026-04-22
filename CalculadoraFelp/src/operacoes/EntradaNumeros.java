/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import java.util.Scanner;

/**
 *
 * @author info226
 */
public class EntradaNumeros {
    int x;
    int y;
    
    public void pedirNumeros(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("De o primeiro valor: ");
        x = scanner.nextInt();
        System.out.println("De o segundo valor: ");
        y = scanner.nextInt();
    }
}
