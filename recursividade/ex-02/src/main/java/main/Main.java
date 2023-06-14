package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int nmr = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));

        double fatorial = calcularFatorial(nmr);

        JOptionPane.showMessageDialog(null, "O fatorial de " + nmr + " é: " + fatorial);
    }

    private static long calcularFatorial(int nmr) {
        if (nmr == 0) {
            return 1;
        } else {
            return nmr * calcularFatorial(nmr - 1);
        }
    }
}