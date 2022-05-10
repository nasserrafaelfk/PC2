/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author nrk
 */
public class CallCenter {
    public static void main(String[] args) {

        String problema = "";
        Interpretadora interpretadora = new Interpretadora();
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo ao Suporte Técnico!");
        do{
            System.out.println("\nDescreva seu problema de maneira sucinta ou digite 'sair' para sair do suporte: ");
            problema = input.nextLine();
            interpretadora.separaProblema(problema.toLowerCase());
        }while(!problema.toLowerCase().equals("sair"));
        System.out.println("\nEsperamos ter resolvido seu problema, volte sempre que necessário!");
    } 
}
