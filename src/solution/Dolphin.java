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
public class Dolphin extends Animal implements Swimmable {

    public Dolphin() {
        size = "large";
        color = "grey";
    }
    
    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
    
}
