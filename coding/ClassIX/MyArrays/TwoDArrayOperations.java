package MyArrays;


/**
 * Write a description of class TwoDArrayOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoDArrayOperations
{
    public static int[][] verticalFlip(int[][] A){
        int VFArr[][] = new int[A.length][];
        int i;
        for(i = 0; i < A.length; i++){
            VFArr[i] = new int[A[i].length];
            VFArr[i] = A[A.length-1-i];
        }
        return VFArr;
    }
    
    public static int[][] horizontalFlip(int[][] A){
        int[][] HFArr = new int[A.length][];
        int i,j;
        for(i = 0; i < A.length; i++){
            HFArr[i] = new int[A[i].length];
            for(j= 0; j < A[i].length; j++){
                HFArr[i][j] = A[i][A[i].length -1 - j];
            }
        }
        return HFArr;
    }
}