package ClassAndObjects;


/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animal
{
    class Location{ //Nested class
        int latitude, longitude;
    }
    {
        System.out.print("\nHello!");
    }
    String breed;
    String animalName;
    String location;
    
    //setter methods 
    
    //getter methods
    
    public void display(){
        System.out.print("\nDetails of animal:");
        System.out.print("\nBreed: " + breed);
        System.out.print("\nAnimal name: " + animalName);
        System.out.print("\nLocation: " + location);
    }
}