package ConditionalStatements;
import java.util.*;


/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dice
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        System.out.print("Dice rolled: " + new Random().nextInt(1, 7));
    }
}
