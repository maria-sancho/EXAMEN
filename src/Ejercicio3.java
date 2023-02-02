import java.util.Scanner;

public class Ejercicio3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor de n: ");
        int n = sc.nextInt();

        int suma = 0;

        for (int i = 2; i <= 2 * n; i += 2) {
            suma += i;
        }


        System.out.println("La suma de los primeros " + n + " números pares es: " + suma);
    }
}


