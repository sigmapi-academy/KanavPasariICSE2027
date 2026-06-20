package MethodsInJava.Overloading;

/**
 * Write a description of class ArithmeticOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arithmetic
{
    public static int add(int x, int y){
        return (x + y);
    }

   // public static float add(int x, int y){
     //   return (x + y);
    //}
    
    public static float add(int x, float y){
        return (x + y);
    }

    public static float add(float x, int y){
        return (x + y);
    }

    public static float add(float x, float y){
        return (x + y);
    }

    public static double add(double x, double y){
        return (x + y);
    }

}