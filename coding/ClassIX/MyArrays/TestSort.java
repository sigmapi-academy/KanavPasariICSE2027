package MyArrays;
import java.util.*;


/**
 * Write a description of class TestSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestSort
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numOfElements, A[], i;
        System.out.print("\fEnter number of elements: ");
        numOfElements = sc.nextInt();
        A = new int[numOfElements];
        ArraysUtility.input(A, "Enter value in A[]");
        ArraysUtility.printArray(A, "Before sorting A[]:");
        //SortingAlgos.bubblesort(A);
        //SortingAlgos.selectionSort(A, true);
        //SortingAlgos.selectionSort(A, false);
        //SortingAlgos.insertionSort(A);
        SortingAlgos.insertionSort(A, false);
        //SortingAlgos.insertionSort(A, true);
        ArraysUtility.printArray(A, "After sorting A[]:");
    }
}