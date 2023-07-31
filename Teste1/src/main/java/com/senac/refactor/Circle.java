package com.senac.refactor;

public class Circle {

    public double calculaAreaDoCirculo(double raio) {
        double area = Math.PI * raio * raio;
        return area;
    }

    public double calculaPerimetroDoCirculo(double raio) {
        double perimetro = 2 * Math.PI * raio;
        return perimetro;
    }

    public double calculaVolumeDaEsfera(double raio) {
        double volume = (4 * Math.PI * raio * raio * raio) / 3;
        return volume;
    }

    public double calculaAreaDaSuperficieDaEsfera(double raio) {
        double area = 4 * Math.PI * raio * raio;
        return area;
    }
}
