package BoxingAndUnBoxing;


/**
 * Write a description of class IntegerConvertsDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntegerConvertsDemo
{
    public static void main(String[] args){
        int num = 26;
        System.out.print("\fDecimal: " + num);
        System.out.print("\nBinary: " + Integer.toBinaryString(num));
        System.out.print("\nOctal: " + Integer.toOctalString(num));
        System.out.print("\nHexadecimal: " + Integer.toHexString(num));
        System.out.print("\nNumerical Value of a char: " + Character.getNumericValue('\u216C'));
    }
}