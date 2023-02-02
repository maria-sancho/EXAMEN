public class Ejercicio5 {

    public static int productoPosicionesPares(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int producto = 1;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                producto *= array[i];
            }
        }
        return producto;
    }
}


