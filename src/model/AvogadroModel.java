package model;

public class AvogadroModel {

    private double v1;  // Volumen inicial
    private double n1;  // Cantidad inicial de moles
    private double v2;  // Volumen final
    private double n2;  // Cantidad final de moles

    // Constructor predeterminado (sin argumentos)
    public AvogadroModel() {
    }

    // Constructor con argumentos para establecer los valores iniciales
    public AvogadroModel(double v1, double n1, double v2, double n2) {
        this.v1 = v1;
        this.n1 = n1;
        this.v2 = v2;
        this.n2 = n2;
    }

    // Métodos para obtener los valores de v1, n1, v2 y n2
    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    // Calcular el volumen final (V2) o la cantidad final de moles (n2)
    public double calcular(double v1, double n1, double v2, double n2) {
        if (v1 > 0 && n1 > 0 && v2 > 0 && n2 > 0) {
            // Si se proporcionan todos los valores, no se calcula nada
            return 0.0;
        } else if (v1 > 0 && n1 > 0 && v2 > 0) {
            // Si se conocen V1, n1 y V2, calcular n2
            return (n1 * v2) / v1;
        } else if (v1 > 0 && n1 > 0 && n2 > 0) {
            // Si se conocen V1, n1 y n2, calcular V2
            return (v1 * n2) / n1;
        } else {
            // No se proporcionan suficientes valores para el cálculo
            return 0.0;
        }
    }

}
