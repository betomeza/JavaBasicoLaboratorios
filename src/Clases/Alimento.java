/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author PCC-DOMINGO
 */
public class Alimento {
    
    private int idAlimento;
    private String nombre;
    private String tipoAlimento;
    private String unidadMedida;
    private double costoUM;
    private String valorNutricional;

    public Alimento(int idAlimento, String nombre, String tipoAlimento, String unidadMedida, double costoUM, String valorNutricional) {
        this.idAlimento = idAlimento;
        this.nombre = nombre;
        this.tipoAlimento = tipoAlimento;
        this.unidadMedida = unidadMedida;
        this.costoUM = costoUM;
        this.valorNutricional = valorNutricional;
    }

    
    
    public int getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(int idAlimento) {
        this.idAlimento = idAlimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getCostoUM() {
        return costoUM;
    }

    public void setCostoUM(double costoUM) {
        this.costoUM = costoUM;
    }

    public String getValorNutricional() {
        return valorNutricional;
    }

    public void setValorNutricional(String valorNutricional) {
        this.valorNutricional = valorNutricional;
    }
    
    
}
