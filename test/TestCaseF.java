/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Locale;
import org.junit.Test;
import static org.junit.Assert.*;
import solution.Rooster;

/**
 *
 * @author arthur0610
 */
public class TestCaseF {
    
     @Test
     public void testing() {
         System.out.println("default language (English) :- ");
         Rooster rooster = new Rooster();
         rooster.sound();
         
         System.out.println("\nGERMAN language :- ");
         Locale.setDefault(Locale.GERMAN);
         Rooster rooster2 = new Rooster();
         rooster2.sound();
         
         System.out.println("\nITALIAN language :- ");
         Locale.setDefault(Locale.ITALIAN);
         Rooster rooster3 = new Rooster();
         rooster3.sound();
         
         System.out.println("\nJAPAN language :- ");
         Locale.setDefault(Locale.JAPAN);
         Rooster rooster4 = new Rooster();
         rooster4.sound();
     }
}
