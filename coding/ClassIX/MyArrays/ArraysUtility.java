package MyArrays;
import java.util.Scanner;


/**
 * Write a description of class ArraysUtility here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArraysUtility
{
    private static Scanner sc = new Scanner(System.in);
    public static void input(int A[], String msg){
        System.out.print("\n" + msg + "\n");
        int i;
        for(i = 0; i < A.length; i++){
            System.out.print("Enter values in ["+i+"]: ");
            A[i] = sc.nextInt();
        }
    }
    public static void printArray(int A[], String msg){
        System.out.print("\n" + msg + "\n[ ");
        int i;
        for(i = 0; i < A.length - 1; i++){
            System.out.print(A[i]+", ");
        }
        System.out.print(A[i]+" ]");
    }
}