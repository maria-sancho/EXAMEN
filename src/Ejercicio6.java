import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        Scanner sc = new Scanner(System.in);
        int indice = 0;

        while (indice < 0 || indice >= array.length) {
            System.out.print("Introduce el índice del elemento a eliminar (entre 0 y " + (array.length - 1) + "): ");
            indice = sc.nextInt();
        }

        for (int i = indice; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = 0;

        System.out.print("Array actualizado: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
