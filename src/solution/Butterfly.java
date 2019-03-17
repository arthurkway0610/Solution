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
public class Butterfly extends Animal implements Flyable {
    
    public Butterfly(Caterpillar caterpillar) {
        sound = caterpillar.sound;
        gender = caterpillar.gender;
        size = "small";
        color = "orange";
    }

    public Butterfly() {
        size = "small";
        color = "orange";
        sound = "";
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }

}