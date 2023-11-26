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
        int valorA = 1;
        String signo;
        String acumulador = "1";
        int num = 3;

        while (num <= 15) {
            if (valorA % 2 == 0) {
                signo = "+";
            } else {
                signo = "-";
            }
            valorA = valorA + 1;
            acumulador = String.format("%s %s 1/%s",
                     acumulador, signo, num);
            num = num + 2;
        }
        System.out.println(acumulador);
    }
}
