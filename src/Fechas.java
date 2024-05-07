import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Fechas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la primera fecha como DD/MM/AAAA: ");
        String datoA = sc.next();

        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA: ");
        String datoB = sc.next();

        int f1d = parseInt (datoA.substring(0,2));
        int f1m = parseInt (datoA.substring(3,5));
        int f1a = parseInt (datoA.substring(6));

        int f2d = parseInt (datoB.substring(0,2));
        int f2m = parseInt (datoB.substring(3,5));
        int f2a = parseInt (datoB.substring(6));

        if (f1a < f2a){
            System.out.println("persona 1 es mayor");
        } else if (f2a < f1a) {
            System.out.println("persona 2 es mayor");
        } else if (f1m < f2m) {
            System.out.println("persona 1 es mayor");
        } else if (f2m < f1m ) {
            System.out.println("persona 2 es mayor");
        } else if (f1d < f2d) {
            System.out.println("persona 1 es mayor");
        } else if (f2d < f1d){
            System.out.println("persona 2 es mayor");
        } else {
            System.out.println("Tienen la misma edad");
        }


    }
}