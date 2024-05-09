import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class temporizador {
    public static void main(String[] args) {

        //Crear un temporizador de acuerdo a un número ingresado por el usuario:

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese numero : ");
        int numero = leer.nextInt();
        System.out.println(" ");
        System.out.println("Inicia el conteo");

        while (numero >= 0) {
            System.out.printf("%d\n", numero);
            numero--;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }





    }
}
