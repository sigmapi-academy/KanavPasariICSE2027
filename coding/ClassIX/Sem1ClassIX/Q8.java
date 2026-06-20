package Sem1ClassIX;


/**
 * Write a description of class Q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8
{
    public static void main(String[] args){
        System.out.print("\f");
        int i;
        for(i = 10; i < 98; i++){
            int d1 = i % 10;
            int d2 = i / 10;
            if(d1 - d2 == 1 || d1 - d2 == -1){
                System.out.print(i+", ");
            }
        }
        System.out.print(i);
    }
}