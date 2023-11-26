/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author StarMedia
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String posicion;
        int edad;
        double estatura;
        String listado1 = "Listado de Jugadores\n";
        String listado2 = "Listado de Edades";
        int contador = 0;
        boolean estado = true;
        int salida;
        double promedioEdad = 0;
        double promedioEstatura = 0;
        do {
            contador++;
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion del jugador");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            promedioEdad = promedioEdad + edad;
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            promedioEstatura = promedioEstatura + estatura;
            listado1 = String.format("%s%s. %s -%s-, edad %s, estatura %.2f\n",
                    listado1, contador, nombre,
                    posicion, edad, estatura);
            listado2 = String.format("%s\n%s", listado2, edad);

            System.out.println("Ingrese (-1) si desea salir del ciclo; ");
            salida = entrada.nextInt();
            if (salida == -1) {
                estado = false;
            }
            entrada.nextLine();
        } while (estado);
        promedioEdad = promedioEdad / contador;
        promedioEstatura = promedioEstatura / contador;
        System.out.printf("%s%s\nPromedio de edades: %.2f\n"
                + "Promedio de estatura: %.2f\n",
                listado1,listado2,promedioEdad,promedioEstatura);
    }

}
