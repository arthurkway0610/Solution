/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import solution.Butterfly;
import solution.Caterpillar;

/**
 *
 * @author arthur0610
 */
public class TestCaseD {

    @Test
    public void testing() {
        System.out.println("Caterpillar :-");
        Caterpillar caterpillar = new Caterpillar();
        System.out.println(caterpillar);
        caterpillar.walk();
        
        System.out.println("\nButterfly :-");
        Butterfly butterfly = caterpillar.metamorphosis();
        System.out.println(butterfly);
        butterfly.fly();

    }
}
