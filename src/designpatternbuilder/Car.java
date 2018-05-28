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
public class Car implements CarPlan{

    private String wheelss;
    private String gear;
    private String engine;
    private String color;
    @Override
    public void setWheels(String wheels) {
        this.wheelss=wheels;
    }

    @Override
    public void setGear(String gear) {
       this.gear=gear;
    }

    @Override
    public void setEngine(String engine) {
        this.engine=engine;
    }
    
    @Override
    public void setCarColor(String color) {
        this.color=color;
    }
    
    public String toString(){
        return "El carro tiene lo siguiente: Engine: "+engine+" wheels: "+" gear: "+gear+" Car Color: "+color;
    }
}
