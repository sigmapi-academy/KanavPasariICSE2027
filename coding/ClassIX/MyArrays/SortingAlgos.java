package MyArrays;

/**
 * Write a description of class SortingAlgos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortingAlgos
{
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
    
    public static void selectionSort(int a[]){
        int i, j, minIndex, t;
        for(i = 0; i < a.length - 1; i++){
            //loop to find smallest element index
            for(minIndex = i, j = i+1; j < a.length; j++){
                if(a[minIndex] > a[j]){
                    minIndex = j;
                }
            }
            //swap the ith index value with minIndex value
            t = a[i];
            a[i] = a[minIndex];
            a[minIndex] = t;
        }
    }
    
    /**
     * @param a int[]
     * @param isAsc if value is true then it arranges the array 
     * in ascending order otherwise in descending order
     */
    public static void selectionSort(int a[], boolean isAsc){
        int i, j, index, t;
        for(i = 0; i < a.length - 1; i++){
            //loop to find smallest element index
            for(index = i, j = i+1; j < a.length; j++){
                if(a[index] > a[j] && isAsc){
                    index = j;
                }
                else if(a[index] < a[j] && !isAsc){
                    index = j;
                }
            }
            //swap the ith index value with minIndex value
            t = a[i];
            a[i] = a[index];
            a[index] = t;
        }
    }
    
    public static void insertionSort(int a[]){
        int i, j, key;
        for(i = 1; i < a.length; i++){
            for(key = a[i], j = i - 1; j >= 0 && key < a[j]; a[j+1] = a[j],j--);
            //{
                //a[j+1] = a[j]; //shifting of previous element to next index
            //}
            a[j+1] = key;
        }
    }
    
    /**
     * @param a int[]
     * @param isAsc if value is true then it arranges the array 
     * in ascending order otherwise in descending order
     */
    
    public static void insertionSort(int a[], boolean isAsc){
        int i, j, key;
        for(i = 1; i < a.length; i++){
            //loop for ascending
            for(key = a[i], j = i - 1; isAsc && j >= 0 && key < a[j]; a[j+1] = a[j],j--);
            //loop for descending
            for(; !isAsc && j >= 0 && key > a[j]; a[j+1] = a[j],j--);
            a[j+1] = key;
        }
    }
    
}