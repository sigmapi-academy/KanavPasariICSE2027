package Looping;


/**
 * Write a description of class Q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8
{
    public static void main(String args[]){
        int i, j, n = 5;
        System.out.print("\f");
        for(i = 1; i <= n; i++){
            for(j = i; j >= 1;j--){
                System.out.print(j);
            }
            System.out.print("\n");
        }
        
        for(i-=2;i > 0; i--){
            for(j = i; j >0; j--){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}