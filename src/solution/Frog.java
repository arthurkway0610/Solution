/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

/**
 *
 * @author arthur0610
 */
public class Frog extends Animal implements Swimmable, Walkable {

    public Frog() {
        size = "small";
        color = "green";
    }
    
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }
    
}
