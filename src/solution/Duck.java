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
public class Duck extends Gull implements Swimmable {

    public Duck() {
        sound = "Quack, quack";
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }

}

class Gull extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
