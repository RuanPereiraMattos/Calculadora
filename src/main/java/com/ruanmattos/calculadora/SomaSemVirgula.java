/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ruanmattos.calculadora;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class SomaSemVirgula {

    public SomaSemVirgula() {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro valor(SEM VIRGULA): ");
        int valor_um = s.nextInt();
        s.nextLine();
        System.out.print("Digite o segundo valor(SEM VIRGULA): ");
        int valor_dois = s.nextInt();
        s.nextLine();
        int soma = valor_um + valor_dois;
        System.out.println("A soma do primeiro numero com o segundo numero e: " + soma);
    }

    public static void main(String[] args) {
        new SomaSemVirgula();
    }
    
}
