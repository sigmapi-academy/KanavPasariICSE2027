package StringClasses;

/**
 * Write a description of class DemoOf_charAt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DemoOf_charAt
{
    /**
     * Enter any string in args[]: 
     */
    public static void main(String[] args){
        String h = args[0];
        int i;
        System.out.print("\f");
        if(h.isEmpty()){
            System.out.print("\nString is empty.");
        }
        else{
            for(i = 0; i < h.length(); i++){
                char c = h.charAt(i);
                if(c != ' '){
                    System.out.print("\n" + c);
                }
            }   
        }
    }
}