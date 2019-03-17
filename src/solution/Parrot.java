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
public class Parrot extends Gull {

    public Parrot() {

    }

    public Parrot(Object object) {
        if (object instanceof Animal) {
            sound = ((Animal) object).sound;
        } else if (object instanceof String) {
            sound = (String) object;
        } else {
            sound = "";
        }
    }

}
