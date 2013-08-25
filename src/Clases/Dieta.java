/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author PCC-DOMINGO
 */
public class Dieta {
    
    private int idDieta;
    private int idAlimento;
    private double cantidadAlimento;
    private double cantidadAgua;

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public void setCantidadAlimento(double cantidadAlimento) {
        this.cantidadAlimento = cantidadAlimento;
    }

    public void setCantidadAgua(double cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public int getIdAlimento() {
        return idAlimento;
    }

    public double getCantidadAlimento() {
        return cantidadAlimento;
    }

    public double getCantidadAgua() {
        return cantidadAgua;
    }
    
    
}
