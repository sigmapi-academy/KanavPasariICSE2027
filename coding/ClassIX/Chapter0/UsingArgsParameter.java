package Chapter0;


/**
 * Write a description of class UsingArgsParameter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UsingArgsParameter
{
    public static void main(String args[]){
        //we need to understand how many inputs we need prior to write our code.
        int x = Integer.parseInt(args[0]);
        double d = Double.parseDouble(args[1]);
        System.out.print("\fx = " + x + "\n d = " + d);
    }
}