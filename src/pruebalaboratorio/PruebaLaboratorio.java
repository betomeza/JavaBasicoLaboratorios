/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebalaboratorio;

import Clases.*;

/**
 *
 * @author PCC-DOMINGO
 */
public class PruebaLaboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal[] animales = {new Cerdo (1, "cerdo", "Porky", 500.00d, "01/01/2013", 
                "Este es el Registro 1"), new Caballo (2, "caballo", "Postin", 
                450.00d, "02/03/2012", "Registro 2")};
        
        for(int i=0; i<animales.length; i++){
            System.out.println("Animal 1  " + animales[i].getIdAnimal()+" "+animales[i].getEspecie()
                    +" "+animales[i].getEspecie());
        
        }
        
        Alimento[] alimentos = {new Alimento (1, "sustancia", "Carne", "litros", 50.00d, 
                "Valor Nutricional 1"), new Alimento (2, "carnaza", "pollo", 
                "kilogramo", 15.00d, "Valor Nutricional 2")};
        
        for(int i=0; i<alimentos.length; i++){
            System.out.println("Alimento 1  " + alimentos[i].getIdAlimento()+" "+alimentos[i].getNombre());
        
        }
        
    }
}
