package com.senac.refactor;

public class Circle {

    public double calculaAreaDoCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    public double calculaPerimetroDoCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    public double calculaVolumeDaEsfera(double raio) {
        return (4 * Math.PI * raio * raio * raio) / 3;
    }

    public double calculaAreaDaSuperficieDaEsfera(double raio) {
        return 4 * Math.PI * raio * raio;
    }
}
