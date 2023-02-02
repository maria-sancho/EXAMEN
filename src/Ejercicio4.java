public class Ejercicio4 {

    public static int contarConsonantes(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                contador++;
            }
        }
        return contador;
    }
}




