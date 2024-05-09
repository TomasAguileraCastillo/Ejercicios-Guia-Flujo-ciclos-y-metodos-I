import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SumaPar {
    public static void main(String[] args) {
        //Crear el programa SumaPar.java donde se sumen únicamente los números pares dentro del
        //ciclo entre 1 y un número ingresado por el usuario.
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresar numero : ");
        int numero = leer.nextInt();
        System.out.println(" ");
        int sumatoria =0;

        for (int i = numero; i >= 1 ; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
                sumatoria =sumatoria + i;
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Total suma de numeros pares : "+sumatoria);
    }
}
