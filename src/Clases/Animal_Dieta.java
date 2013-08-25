/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author PCC-DOMINGO
 */
public class Animal_Dieta {
    
    private int idDieta;
    private int idAnimal;
    private String toma1;
    private String hora1;
    private String toma2;
    private String hora2;
    private String toma3;
    private String hora3;
    private boolean swActivo;

    public int getIdDieta() {
        return idDieta;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public String getToma1() {
        return toma1;
    }

    public String getHora1() {
        return hora1;
    }

    public String getToma2() {
        return toma2;
    }

    public String getHora2() {
        return hora2;
    }

    public String getToma3() {
        return toma3;
    }

    public String getHora3() {
        return hora3;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public void setToma1(String toma1) {
        this.toma1 = toma1;
    }

    public void setHora1(String hora1) {
        this.hora1 = hora1;
    }

    public void setToma2(String toma2) {
        this.toma2 = toma2;
    }

    public void setHora2(String hora2) {
        this.hora2 = hora2;
    }

    public void setToma3(String toma3) {
        this.toma3 = toma3;
    }

    public void setHora3(String hora3) {
        this.hora3 = hora3;
    }

    public boolean isSwActivo() {
        return swActivo;
    }

    public void setSwActivo(boolean swActivo) {
        this.swActivo = swActivo;
    }
    
    
}
