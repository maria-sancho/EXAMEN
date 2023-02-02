class Circulo {
    private double radio;

    public Circulo() {
        this.radio = 1;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularLongitud(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double calcularAreaStatic(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularLongitudStatic(double radio) {
        return 2 * Math.PI * radio;
    }
}
