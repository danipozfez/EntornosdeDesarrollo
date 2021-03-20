/**
 * @author
 * @version
 *
 */

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menu");
        System.out.println("1. area circulo de radio 5");
        System.out.println("2. area cuadrado de lado 5");
        System.out.println("3. area triangulo rectangulo de lado 5");
        System.out.println("0. Terminar");

        System.out.println("elije una opcion");
        opcion = entrada.nextInt();
        entrada.nextLine();


        switch (opcion) {
            case 1:
                System.out.println(Metodos.calculoCirculo());
                break;
            case 2:
                System.out.println(Metodos.calculoCuadrado());
                break;
            case 3:
                System.out.println(Metodos.calculoTriangulo());
                break;
            case 0:
                System.out.println("Adios");
                break;

            default:
                System.out.println("Numero no valido");


        }
    }
}




	