/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Test;
import static org.junit.Assert.*;
import solution.Chicken;
import solution.Duck;

/**
 *
 * @author arthur0610
 */
public class TestCaseA2 {
    
    @Test
     public void testing() {
         System.out.println("Duck :-");
         Duck duck = new Duck();
         duck.sound();
         duck.swim();
         
         System.out.println("\nChicken :-");
         Chicken chicken = new Chicken();
         chicken.sound();
     }
    
}
