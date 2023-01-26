import java.util.Random;

public class Password {
    private int longitud;
    private String contrasena;

    public Password() {
        this.longitud = 8;
        this.contrasena = generarContrasena();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasena = generarContrasena();
    }

    public String generarContrasena() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        String contrasena = "";
        Random rand = new Random();
        for (int i = 0; i < this.longitud; i++) {
            contrasena += caracteres.charAt(rand.nextInt(caracteres.length()));
        }
        return contrasena;
    }

    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        for (int i = 0; i < this.contrasena.length(); i++) {
            char caracter = this.contrasena.charAt(i);
            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                minusculas++;
            } else if (Character.isDigit(caracter)) {
                numeros++;
            }
        }
        return (mayusculas > 2 && minusculas > 1 && numeros > 5);
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        this.contrasena = generarContrasena();
    }
}
