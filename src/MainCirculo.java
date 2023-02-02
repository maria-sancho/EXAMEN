import java.util.Scanner;

public class MainCirculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");

        double radio = scanner.nextDouble();

        double area = Circulo.calcularAreaStatic(radio);

        double longitud = Circulo.calcularLongitudStatic(radio);

        System.out.println("El área del círculo es: " + area);
        System.out.println("La longitud del círculo es: " + longitud);

        Circulo circulo = new Circulo(10);

        area = circulo.calcularArea(circulo.getRadio());

        longitud = circulo.calcularLongitud(circulo.getRadio());

        System.out.println("El área del círculo es: " + area);
        System.out.println("La longitud del círculo es: " + longitud);
    }
}
