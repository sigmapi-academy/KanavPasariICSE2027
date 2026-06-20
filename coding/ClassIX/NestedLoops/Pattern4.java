package NestedLoops;
import java.util.*;

/**
 * Write a description of class Pattern4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pattern4
{
    public static void main(String[] args){
        String output = "\n";
        int i, j, len;
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter the side length: ");
        len = sc.nextInt();
        for(i = 0; i < len; i++){
            output +="A ";
        }
        for(i = 1; i < len-1; i++){
            output += "\nA ";
            for(j = 1; j < len-1; j++){
                output +="B ";
            }
            output += "A ";
        }
        output += '\n';
        for(i = 0; i < len; i++){
            output += "A ";
        }
        
        System.out.print(output);
    }
}