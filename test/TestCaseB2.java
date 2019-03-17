/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import solution.Clownfish;
import solution.Shark;

/**
 *
 * @author arthur0610
 */
public class TestCaseB2 {
    
     @Test
     public void testing() {
         System.out.println("Sharks :-");
         Shark shark = new Shark();
         System.out.println(shark);
         shark.swim();
         shark.eat();
         
         System.out.println("\nClownfish :-");
         Clownfish clownfish = new Clownfish();
         System.out.println(clownfish);         
         clownfish.swim();
         clownfish.joke();
         
         
     }
}
