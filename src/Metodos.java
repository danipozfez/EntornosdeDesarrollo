/**
 * @param
 *
 */
public class Metodos {

    public static double calculoCirculo () {
        double PI=3.14;
        int radio = 5;
        double circulo = PI*radio*radio;
        System.out.println("el area del ciculo es");
        return circulo;


    }
    public static double calculoCuadrado() {

        int lado=5;
        int cuadrado= lado*lado;

        System.out.println("el area del cuadrado es");
        return cuadrado;

    }
    public static double calculoTriangulo() {

        double base=5;

        double altura=5;

        double area=(base*altura/2);

        System.out.println("el area del triangulo es");
        return area;

    }
}
