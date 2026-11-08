package BoxingAndUnBoxing;


/**
 * Write a description of class IntegerValueOfDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntegerValueOfDemo
{
    public static void main(String[] args){
        String str = "500";
        Integer iob = Integer.valueOf(str);
        System.out.print("\nInteger object : " + iob);
        
        int result = iob + 100;
        System.out.print("\nResult: " + result);
    }
}