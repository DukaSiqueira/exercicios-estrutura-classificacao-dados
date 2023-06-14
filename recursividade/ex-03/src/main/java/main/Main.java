package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int nmr = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        System.out.println("Sequência de Fibonacci até " + nmr + ":");
        for (int i = 0; i <= nmr; i++) {
            int fibonacci = calcularFibonacci(i);
            System.out.print(fibonacci + "\n");
        }
    }

    private static int calcularFibonacci(int nmr) {
        if (nmr <= 1) {
            return nmr;
        } else {
            return calcularFibonacci(nmr - 1) + calcularFibonacci(nmr - 2);
        }
    }
}