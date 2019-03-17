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
public class Dog extends Animal implements Walkable {

    public Dog() {
        sound = "Woof, woof";
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}
