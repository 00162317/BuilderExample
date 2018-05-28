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
public class CarBuilder {
    private Worker worker;
    public CarBuilder(Worker worker){
        this.worker=worker;
    }
    public void buildACar(){
        this.worker.buildEngine();
        this.worker.buildGear();
        this.worker.assembleWheels();
        this.worker.paintTheCar();
    }
    public Car getCar(){
        return this.worker.getCar();
    }
}
