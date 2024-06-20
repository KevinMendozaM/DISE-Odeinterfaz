package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        String primernumero = JOptionPane.showInputDialog("Introduzca el primer numero");
        String segundonumero = JOptionPane.showInputDialog("Introduzca el segundo numero");

        int numero = Integer.parseInt(primernumero);
        int numero2 = Integer.parseInt(segundonumero);
        int resultado = numero + numero2;

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "suma", JOptionPane.INFORMATION_MESSAGE);


    }
}