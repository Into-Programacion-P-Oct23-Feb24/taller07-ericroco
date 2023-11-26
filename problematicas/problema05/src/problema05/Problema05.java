/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

/**
 *
 * @author StarMedia
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 1;
        String signo;
        String acumulador = "1";
        int num = 3;

        do {
            if (valor % 2 == 0) {
                signo = "+";
            } else {
                signo = "-";
            }

            valor = valor + 1;
            acumulador = String.format("%s %s 1/%s", acumulador, signo, num);
            num = num + 2;
        } while (num <= 15);
        System.out.println(acumulador);
    }

}
