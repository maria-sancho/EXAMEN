import java.util.Random;
public class Password {
    private int longitud;
    private String contraseña;

    public Password() {
        this.longitud = 8;
        this.contraseña = generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword();
    }

    public String generarPassword() {
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

        for (int i = 0; i < this.contraseña.length(); i++) {
            char c = this.contraseña.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }

        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContrasena() {
        return contraseña;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword();
    }
}


