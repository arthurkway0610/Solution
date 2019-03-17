/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class Animal {

    void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal {

    void fly() {
        System.out.println("I am flying");
    }
}

public class Solution {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
