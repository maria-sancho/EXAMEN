import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el tamaño del array de passwords: ");

        int tamaño = scanner.nextInt();

        Password[] passwords = new Password[tamaño];
        System.out.print("Ingresa la longitud de los passwords: ");
        int longitud = scanner.nextInt();
        for (int i = 0; i < tamaño; i++) {
            passwords[i] = new Password(longitud);
        }
        boolean[] passwordsFuerte = new boolean[tamaño];
        for (int i = 0; i < tamaño; i++) {
            passwordsFuerte[i] = passwords[i].esFuerte();
        }
        for (int i = 0; i < tamaño; i++) {
            System.out.println(passwords[i].getContrasena() + " " + passwordsFuerte[i]);
        }
    }
}