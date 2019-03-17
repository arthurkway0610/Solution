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
public class Animal implements Soundable, Walkable {
    
    String sound;
    String gender;
    
    @Override
    public void sound() {
        System.out.println(sound);
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + "sound=" + sound + ", gender=" + gender + '}';
    }
    
}

interface Soundable {
    public void sound();
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

interface Swimmable {
    public void swim();
}