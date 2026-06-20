package MyArrays;
import java.util.*;

/**
 * Write a description of class SchoolTecnique here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SchoolTecnique
{
    private static Scanner sc = new Scanner(System.in);
    public static void bubblesort (int a[]) { 
        int i, j, t;
        for (i=0;i<a.length-1; i++) {
            for (j =0; j<a.length-1-i; j++){
                if(a[j]> a[j+1]) {
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }

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

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numOfElements, A[], i;
        System.out.print("\fEnter number of elements: ");
        numOfElements = sc.nextInt();
        A = new int[numOfElements];
        input(A, "Enter value in A[]");
        printArray(A, "Before sorting A[]:");
        bubblesort(A);
        printArray(A, "After sorting A[]:");
    }
}