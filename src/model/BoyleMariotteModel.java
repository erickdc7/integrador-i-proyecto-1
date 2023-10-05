package model;

public class BoyleMariotteModel {

    private double p1;  // Presión inicial
    private double v1;  // Volumen inicial
    private double p2;  // Presión final
    private double v2;  // Volumen final

    // Constructor predeterminado (sin argumentos)
    public BoyleMariotteModel() {
    }

    // Constructor con argumentos para establecer los valores iniciales
    public BoyleMariotteModel(double p1, double v1, double p2, double v2) {
        this.p1 = p1;
        this.v1 = v1;
        this.p2 = p2;
        this.v2 = v2;
    }

    // Métodos para obtener los valores de p1, v1, p2 y v2
    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

    // Calcular la presión final (P2) o el volumen final (V2)
    public double calcular(double p1, double v1, double p2, double v2) {
        if (p1 > 0 && v1 > 0 && p2 > 0 && v2 > 0) {
            // Si se proporcionan todos los valores, no se calcula nada
            return 0.0;
        } else if (p1 > 0 && v1 > 0 && p2 > 0) {
            // Si se conocen P1, V1 y P2, calcular V2
            return (p1 * v1) / p2;
        } else if (p1 > 0 && v1 > 0 && v2 > 0) {
            // Si se conocen P1, V1 y V2, calcular P2
            return (p1 * v1) / v2;
        } else {
            // No se proporcionan suficientes valores para el cálculo
            return 0.0;
        }
    }

}
