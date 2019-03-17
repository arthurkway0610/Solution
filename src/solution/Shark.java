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
public class Shark extends Fish {

    public Shark() {
        size = "large";
        color = "grey";
    }

    public void eat() {
        System.out.println("I am eating other fish");
    }

}