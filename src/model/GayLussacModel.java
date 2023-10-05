package model;

public class GayLussacModel {

    private double p1;  // Presión inicial
    private double t1;  // Temperatura inicial
    private double p2;  // Presión final
    private double t2;  // Temperatura final

    // Constructor predeterminado (sin argumentos)
    public GayLussacModel() {
    }

    // Constructor con argumentos para establecer los valores iniciales
    public GayLussacModel(double p1, double t1, double p2, double t2) {
        this.p1 = p1;
        this.t1 = t1;
        this.p2 = p2;
        this.t2 = t2;
    }

    // Métodos para obtener los valores de p1, t1, p2 y t2
    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getT1() {
        return t1;
    }

    public void setT1(double t1) {
        this.t1 = t1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getT2() {
        return t2;
    }

    public void setT2(double t2) {
        this.t2 = t2;
    }

    // Calcular la presión final (P2) o la temperatura final (T2)
    public double calcular(double p1, double t1, double p2, double t2) {
        if (p1 > 0 && t1 > 0 && p2 > 0 && t2 > 0) {
            // Si se proporcionan todos los valores, no se calcula nada
            return 0.0;
        } else if (p1 > 0 && t1 > 0 && p2 > 0) {
            // Si se conocen P1, T1 y P2, calcular T2 en Kelvin
            return (t1 * p2) / p1;
        } else if (p1 > 0 && t1 > 0 && t2 > 0) {
            // Si se conocen P1, T1 y T2, calcular P2
            return (p1 * t2) / t1;
        } else {
            // No se proporcionan suficientes valores para el cálculo
            return 0.0;
        }
    }

}
