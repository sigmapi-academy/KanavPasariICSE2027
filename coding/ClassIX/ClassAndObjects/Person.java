package ClassAndObjects;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name, mobileNum;
    int x;
    float f;
    double d;
    //default constructor initializes the instance variables 
    // with default values, Integer have 0, String will be null
    // float => 0.0f, double => 0.0
    public Person(){
        System.out.print("\nConstructor called\n");
    }
    
}