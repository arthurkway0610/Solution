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
interface Metamorphosable<T extends Animal> {
    public T metamorphosis();
}

public class Caterpillar extends Animal implements Walkable, Metamorphosable<Butterfly> {

    public Caterpillar() {
        size = "small";
        color = "green";
        sound = "";
        gender = "";
    }
    
    public Caterpillar(String gender) {
        size = "small";
        color = "green";
        sound = "";
        gender = this.gender;
    }

    @Override
    public void walk() {
        System.out.println("I am walking");
    }

    @Override
    public Butterfly metamorphosis() {
        return new Butterfly(this);
    }

}
