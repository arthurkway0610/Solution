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
public class Animal implements Soundable  {
    
    String sound;
    String gender;
    String size;
    String color;
    
    @Override
    public void sound() {
        System.out.println(sound);
    }
    
    public void setSound(Object object) {
        if (object instanceof Animal) {
            sound = ((Animal) object).sound;
        } else if (object instanceof String) {
            sound = (String) object;
        } else {
            sound = "";
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + "sound=" + sound + ", gender=" + gender + ", size=" + size + ", color=" + color + '}';
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