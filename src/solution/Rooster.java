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
public class Rooster implements Soundable, Singable, Walkable {
    
    String sound;
    String gender;

    public Rooster() {
        sound = "Cock-a-doodle-doo";
        gender = "Male";
    }
    
    @Override
    public void sound() {
        System.out.println(sound);
    }

    @Override
    public void sing() {
        System.out.println("I am singing");
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
