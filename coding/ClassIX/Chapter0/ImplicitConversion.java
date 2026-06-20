package Chapter0;


/**
 * Write a description of class ImplicitConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ImplicitConversion
{
    public static void main(String args[]){
        boolean b = true;
        byte bi = 50;
        short s = 500;
        int i = 1000;
        long l = 3456789765445678L;
        float f = 5.67f;
        double d = 7.89;
        char c = 'A';
        
        float ic;
        //ic = b; //not possible
        double id;
        //id = b; //not possible
        long li;
        // li = b; //not possible
        // boolean type cannot be converted to any other type 
        // either explicitly or implicitly
        
        //In the HW try to convert boolean to other types.
        System.out.print("\f"); //always fresh terminal window
        ic = bi;
        System.out.print("\n ic: "+ic);
        ic = s;
        System.out.print("\n ic: "+ic);
        ic = i;
        System.out.print("\n ic: "+ic);
        ic = l;
        System.out.print("\n ic: "+ic);
        ic = f;
        System.out.print("\n ic: "+ic);
        //ic = d; implicit type casting is not possible in this case, data type of 'd'
        // is double.
        ic = c;
        System.out.print("\n ic: "+ic);
        
        
        
        
    }
}