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
public class Animal implements Walkable {

    @Override
    public void walk() {
        System.out.println("I am walking");
    }
    
}

interface Walkable {
    public void walk();
}

interface Flyable {
    public void fly();
}

interface Singable {
    public void sing();
}