package MyArrays;
import java.util.*;


/**
 * Write a description of class TestSearchAlgos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestSearchAlgos
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\fEnter number of elements: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        ArraysUtility.input(A, "Enter integer values in A[]: ");
        ArraysUtility.printArray(A, "Array A[] before sorting: ");
        SortingAlgos.selectionSort(A, true);
        ArraysUtility.printArray(A, "Array A[] after sorting: ");
        System.out.print("\nEnter your search element: ");
        int target = sc.nextInt();
        int index = SearchingAlgos.binarySearch(A, target);
        if(index > -1){
            System.out.print("\nElement found at index: " + index);
        }
        else{
            System.out.print("\nTarget element is not present in the Array.");
        }
    }
}