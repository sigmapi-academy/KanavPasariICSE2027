package BoxingAndUnBoxing;


/**
 * Write a description of class IntegerParseDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntegerParseDemo
{
    public static void main(String[] args){
        System.out.print("\f");
        String str = "250";
        int num = Integer.parseInt(str);
        System.out.print("\nString value: " + str);
        System.out.print("\nInteger value: " + num);
        System.out.print("\nAddition: " + (num + 50));
        
        String snum = Integer.toString(num); 
        System.out.print("\nString snum : " + snum);
    }
}