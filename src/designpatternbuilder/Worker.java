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
public interface Worker {
    public void buildEngine();
    public void buildGear();
    public void assembleWheels();
    public void paintTheCar();
    public Car getCar();
}
