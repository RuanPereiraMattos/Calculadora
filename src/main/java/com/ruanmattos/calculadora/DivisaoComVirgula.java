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
public class DivisaoComVirgula {

    public DivisaoComVirgula() {
        Scanner s = new Scanner(System.in);
        System.out.println("Bem vindo(a) ao programa que divide dois numeros com/sem virgula");
        System.out.print("Digite o primeiro valor(COM/SEM VIRGULA): ");
        double valor_um = s.nextDouble();
        s.nextLine();
        System.out.print("Digite o segundo valor(COM/SEM VIRGULA): ");
        double valor_dois = s.nextDouble();
        s.nextLine();
        double divisao = valor_um / valor_dois;
        System.out.println("A divisao do primeiro numero com o segundo numero e: " + divisao);
    }

    public static void main(String[] args) {
        new DivisaoComVirgula();
    }
    
}
