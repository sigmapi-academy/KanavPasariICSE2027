package StringClasses;


/**
 * Write a description of class TestStringLiteral here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestStringLiteral
{
    public static void main(String[] args){
        
        /*String s2 = "Java";
        System.out.print("\fs1"+System.identityHashCode(s1));
        System.out.print("\ns2"+System.identityHashCode(s2));
        String s3 = "Java";
        System.out.print("\n"+System.identityHashCode(s3));
        
        System.out.print("\n==========================");
        
        String s4 = new String("Java");
        String s5 = new String("Java");
        String s6 = new String("Java");
        String s7 = new String("Java");
        System.out.print("\nHash code of s4: "+System.identityHashCode(s3));
        System.out.print("\nHash code of s5: "+System.identityHashCode(s3));
        System.out.print("\nHash code of s6: "+System.identityHashCode(s3));
        System.out.print("\nHash code of s7: "+System.identityHashCode(s3));*/
        
        String s1 = "Java";
        String s2 = "Programming";
        
        System.out.print("\fs1+s2 = "+s1.concat(s2)); // joining of two string
        System.out.print("\ns1 = " + s1 + "\ns2 = " + s2);
    }
}