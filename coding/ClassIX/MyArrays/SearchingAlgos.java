package MyArrays;


/**
 * Write a description of class SearchingAlgos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SearchingAlgos
{
    public static int binarySearch(int A[], int target){
        int mid, low = 0, high = A.length - 1;
        while(low <= high){
            mid = (low + high) / 2;
            if(A[mid] == target){
                return mid;
            }
            if(A[mid] < target){
                //target may be present in right half
                low = mid + 1;
            }
            else{
                //target may be present in left half
                high = mid - 1;
            }
        }
        return -1;
    }
}