/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author DAW-A
 */
public class Tiro {
    private double velocidadIni;
    private int angulo;
    private double gravedad;
    private double alcanceMax;
    private double alturaMax;

    public Tiro(double velocidadIni, int angulo) {
        this.velocidadIni = velocidadIni;
        this.angulo = angulo;
        gravedad=9.8;
        alcanceMax=Math.pow(velocidadIni, 2)*Math.sin(Utilidades.gradosAradianes(angulo)*2)/gravedad;
        alturaMax=Math.pow(velocidadIni, 2)*Math.pow(Math.sin(Utilidades.gradosAradianes(angulo)), 2)/2*gravedad;
    }

    public double getVelocidadIni() {
        return velocidadIni;
    }

    public void setVelocidadIni(double velocidadIni) {
        this.velocidadIni = velocidadIni;
    }

    public int getAngulo() {
        return angulo;
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    public double getAlcanceMax() {
        return alcanceMax;
    }

    public void setAlcanceMax(double alcanceMax) {
        this.alcanceMax = alcanceMax;
    }

    public double getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(double alturaMax) {
        this.alturaMax = alturaMax;
    }
    
    
    
}
