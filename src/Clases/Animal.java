/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


/**
 *
 * @author PCC-DOMINGO
 */
public abstract class Animal {
    
    private int idAnimal;
    private String especie;
    private String nombre;
    private double peso;
    private String fechaNacimiento;
    private String obsGeneral;

    public Animal(int idAnimal, String especie, String nombre, double peso, String fechaNacimiento, String obsGeneral) {
        this.idAnimal = idAnimal;
        this.especie = especie;
        this.nombre = nombre;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
        this.obsGeneral = obsGeneral;
    }

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int IdAnimal) {
        this.idAnimal = IdAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String Especie) {
        this.especie = Especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getObsGeneral() {
        return obsGeneral;
    }

    public void setObsGeneral(String obsGeneral) {
        this.obsGeneral = obsGeneral;
    }   
    
}
