/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Test;
import static org.junit.Assert.*;
import solution.Cat;
import solution.Dog;
import solution.Parrot;
import solution.Rooster;
import solution.Duck;

/**
 *
 * @author arthur0610
 */
public class TestCaseA4 {

    @Test
    public void testing() {
        System.out.println("live with Dog:- ");
        Parrot parrot1 = new Parrot(new Dog());
        parrot1.sound();
        
        System.out.println("\nlive with Cat:- ");
        Parrot parrot2 = new Parrot(new Cat());
        parrot2.sound();
        
        System.out.println("\nlive with Rooster:- ");
        Parrot parrot3 = new Parrot(new Rooster());
        parrot3.sound();
        
        System.out.println("\nlive with Duck:- ");
        Parrot parrot4 = new Parrot(new Duck());
        parrot4.sound();
        
        System.out.println("\nlive with Phone:- ");
        Parrot parrot5 = new Parrot();
        parrot5.setSound("Ring Ring");
        parrot5.sound();
    }

}
