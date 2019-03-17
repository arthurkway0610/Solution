/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import solution.*;

/**
 *
 * @author arthur0610
 */
public class TestCaseE {

    @Test
    public void testing() {
        Animal[] animals = new Animal[]{
            new Bird(),
            new Duck(),
            new Chicken(),
            new Rooster(),
            new Parrot(),
            new Fish(),
            new Shark(),
            new Clownfish(),
            new Dolphin(),
            new Frog(),
            new Dog(),
            new Butterfly(),
            new Cat()
        };
        
        int flyCount = 0;
        int walkCount = 0;
        int singCount = 0;
        int swimCount = 0;
        for (Animal animal : animals) {
            System.out.println(animal);
            
            try {
                Method fly = animal.getClass().getMethod("fly");
                fly.invoke(animal);
                flyCount++;
            } catch (Exception ex) {
                //ignore
            }
            try {
                Method walk = animal.getClass().getMethod("walk");
                walk.invoke(animal);
                walkCount++;
            } catch (Exception ex) {
                //ignore
            }
            try {
                Method sing = animal.getClass().getMethod("sing");
                sing.invoke(animal);
                singCount++;
            } catch (Exception ex) {
                //ignore
            }
            try {
                Method swim = animal.getClass().getMethod("swim");
                swim.invoke(animal);
                swimCount++;
            } catch (Exception ex) {
                //ignore
            }
            
            System.out.println("");
        }

        System.out.println("Fly Count " + flyCount);
        System.out.println("Walk Count " + walkCount);
        System.out.println("Sing Count " + singCount);
        System.out.println("Swim Count " + swimCount);
    }
}
