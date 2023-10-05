package model;

public class CharlesModel {

    private double v1;  // Volumen inicial
    private double t1;  // Temperatura inicial
    private double v2;  // Volumen final
    private double t2;  // Temperatura final

    // Constructor predeterminado (sin argumentos)
    public CharlesModel() {
    }

    // Constructor con argumentos para establecer los valores iniciales
    public CharlesModel(double v1, double t1, double v2, double t2) {
        this.v1 = v1;
        this.t1 = t1;
        this.v2 = v2;
        this.t2 = t2;
    }

    // Métodos para obtener los valores de v1, t1, v2 y t2
    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getT1() {
        return t1;
    }

    public void setT1(double t1) {
        this.t1 = t1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

    public double getT2() {
        return t2;
    }

    public void setT2(double t2) {
        this.t2 = t2;
    }

    // Calcular el volumen final (V2) o la temperatura final (T2)
    public double calcular(double v1, double t1, double v2, double t2) {
        if (v1 > 0 && t1 > 0 && v2 > 0 && t2 > 0) {
            // Si se proporcionan todos los valores, no se calcula nada
            return 0.0;
        } else if (v1 > 0 && t1 > 0 && v2 > 0) {
            // Si se conocen V1, T1 y V2, calcular T2 en Kelvin
            return (t1 * v2) / v1;
        } else if (v1 > 0 && t1 > 0 && t2 > 0) {
            // Si se conocen V1, T1 y T2, calcular V2
            return (v1 * t2) / t1;
        } else {
            // No se proporcionan suficientes valores para el cálculo
            return 0.0;
        }
    }

}
