/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author StarMedia
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 1;
        String signo;
        String acumulador = "1";
        double termino;
        int masOmenos = 1;
        double resultado = 0;
        double num = 1;
        while ( num <= 15 ) {
            if (valor % 2 == 0) {
                signo = "+";
            } else {
                signo = "-";
            }
            termino = masOmenos * (1 / num);
            resultado = resultado + termino;
            valor = valor + 1;
            num = num + 2;
            acumulador = String.format("%s %s 1/%s", acumulador, signo, (int) num);
            masOmenos = masOmenos * -1;
        }
        System.out.printf("%s\nEl resultado es: %.2f\n", acumulador, resultado);
    }
}
