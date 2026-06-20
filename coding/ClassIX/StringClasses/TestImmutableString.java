package StringClasses;


/**
 * Write a description of class TestImmutableString here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestImmutableString
{
    public static void main(String[] args){
        String nm = "Sigmapi";
        //concat() method appends the String Literal
        System.out.print("\f" + nm.concat(" Academy"));
        //will print Sigmapi because Strings are immutable objects
        System.out.print("\n"+nm);
        
        String nm1 = new String("James");
        String nm2 = new String(nm1);
        String nm3 = new String(nm1);
        String nm4 = new String(nm1);
        String nm5 = new String(nm1);
        
        System.out.print("\nnm1 = " + nm1);
        System.out.print("\nnm2 = " + nm2);
        System.out.print("\nnm3 = " + nm3);
        System.out.print("\nnm4 = " + nm4);
        System.out.print("\nnm5 = " + nm5);
        nm1 = "Gosling";
        System.out.print("\nnm1 = " + nm1);
        System.out.print("\nnm2 = " + nm2);
        System.out.print("\nnm3 = " + nm3);
        System.out.print("\nnm4 = " + nm4);
        System.out.print("\nnm5 = " + nm5);
        
    }
}