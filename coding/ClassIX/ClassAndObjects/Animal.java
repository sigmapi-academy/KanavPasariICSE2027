package ClassAndObjects;
import java.util.*;


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
        System.out.print("\fHello!\n\n");
    }
    String breed;
    String animalName;
    String location;
    
    //setter methods 
    
    //getter methods
    
    public void insertRecord(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter breed: ");
        breed = sc.nextLine();
        System.out.print("Animal name: ");
        animalName = sc.nextLine();
        System.out.print("Location: ");
        location = sc.nextLine();
    }
    
    public void display(){
        System.out.print("\nDetails of animal:");
        System.out.print("\nBreed: " + breed);
        System.out.print("\nAnimal name: " + animalName);
        System.out.print("\nLocation: " + location);
    }
    
    public static void main(String[] args){
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal();
        
        a1.insertRecord();
        a2.insertRecord();
        a3.insertRecord();
        
        a1.display();
        a2.display();
        a3.display();
    }
}