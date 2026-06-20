package Chapter0;
import java.util.*;


/**
 * Write a description of class DemoOfTerminal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DemoOfTerminal
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter any number: ");
        int x = sc.nextInt();
        System.out.print("\nx = " + x);
    }
}