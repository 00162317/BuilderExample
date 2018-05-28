/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternbuilder;

/**
 *
 * @author Roberto
 */
public class DesignPatternBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MustangWorker engineer = new MustangWorker();
        CarBuilder carBuild = new CarBuilder(engineer);
        
        carBuild.buildACar();
        
        Car carro1 = carBuild.getCar();
        System.out.println("Presentando los carros");
        System.out.println(carro1.toString());
    }
    
}
