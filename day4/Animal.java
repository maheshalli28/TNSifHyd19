package com.day4;
// Process of hiding certain details and showing only essential info to the user.
//Abstract class abstract key word is used
//We can't access the abstract class directly so we need to use inheritance

abstract class Animal {
// Abstract method (does not have a body)
public abstract void animalSound();
// Regular method

public void sleep() {
 System.out.println("Zzz");
}

}

//Subclass (inherit from Animal)
class Pig extends Animal {
public void animalSound() {
 // The body of animalSound() is provided here
 System.out.println("The pig says: wee wee");
}

}
