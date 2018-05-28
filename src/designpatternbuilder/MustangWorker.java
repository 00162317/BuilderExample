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
public class MustangWorker implements Worker {
    private Car car;
    private String wheels,gear,engine,color;
    public MustangWorker(){
        this.car=new Car();
    }
    @Override
    public void buildEngine() {
        car.setEngine("Mustang 2017 - GT-3050R");
    }

    @Override
    public void buildGear() {
        car.setGear("Manual");
    }

    @Override
    public void assembleWheels() {
        car.setWheels("BBS-17");
    }

    @Override
    public void paintTheCar() {
        car.setCarColor("Blue white");
    }

    @Override
    public Car getCar() {
       return this.car;
    }
}
