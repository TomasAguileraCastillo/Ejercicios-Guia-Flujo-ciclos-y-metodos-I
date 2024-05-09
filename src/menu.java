import java.util.Scanner;

public class menu {
    public static void main(String[] args) {

        //Escribir un programa que solicite la carga de dos números
        // y nos realice una operación
        //según la opción ingresada por el usuario.

        Scanner leer = new Scanner(System.in);

        int opcion = 0;
        int numero1 = 0;
        int numero2 = 0;

        System.out.println(" ");
        System.out.println("     Menu     ");
        System.out.println(" ");
        System.out.println("   1)-Sumar   ");
        System.out.println("   2)-Restar");
        System.out.println("   3)-Multiplicar");
        System.out.println("   4)-Dividir");
        System.out.println(" ");
        System.out.println("   5)-Salir ");
        System.out.println(" ");
        System.out.print("    Seleccione una Opcion : ");
        System.out.print(" ");
        opcion = leer.nextInt();
        int resultado = 0;
        String op ;


        if (opcion >= 1 && opcion <= 4) {
            System.out.println(" ");
            System.out.print("Ingrese primer numero  : ");
            numero1 = leer.nextInt();
            System.out.print("Ingrese segundo numero  : ");
            numero2 = leer.nextInt();
            System.out.println(" ");

            if (opcion == 1) {
                resultado = numero1 + numero2;
                System.out.println("El resultaodo es  :" + resultado);
            } else if (opcion == 2) {
                resultado = numero1 - numero2;
                System.out.println("El resultaodo es  :" + resultado);
            } else if (opcion == 3) {
                resultado = numero1 * numero2;
                System.out.println("El resultaodo es  :" + resultado);
            } else if (opcion == 4) {
                resultado = numero1 / numero2;
                System.out.println("El resultaodo es  :" + resultado);
            }
        }else {
            System.out.println("    saliendo   ");
        }



    }
}