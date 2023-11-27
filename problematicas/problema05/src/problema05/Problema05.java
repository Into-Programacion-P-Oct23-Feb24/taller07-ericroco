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
        double termino = 0;
        int masOmenos = 1;
        double resultado = 0;
        double num = 1;
        do {
            if (valor % 2 == 0) {
                signo = "+";
            } else {
                signo = "-";
            }
             termino = masOmenos * (1 / num);
            resultado = resultado + termino;
            valor = valor + 1;
            acumulador = String.format("%s %s 1/%s", acumulador, signo, (int) num);
            masOmenos = masOmenos * -1;
            num = num + 2;
        } while (num <= 15);
        System.out.printf("%s\nEl resultado es: %.2f\n", acumulador, resultado);
    }

}
