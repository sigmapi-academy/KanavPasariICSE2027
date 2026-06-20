package MyArrays;
import java.util.*;

/**
 * WAPJ to store the marks of 50 students of class 10.
 * Your program will find what is the highest marks and 
 * what is the lowest marks, 
 * we need find number of student have got marks lower 
 * than class average.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array1
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num_of_students, i, hm, lm, num_of_below_avg_students, sum;
        double avg;
        int marks[]; //declaration of array
        System.out.print("\fEnter number of students in the class: ");
        num_of_students = sc.nextInt();
        marks = new int[num_of_students]; //memory allocation
        //input marks
        for(i = 0; i < num_of_students; i++){
            System.out.print("Enter marks for student["+i+"]: ");
            marks[i] = sc.nextInt();
        }
        hm = lm = sum = 0;
        for(i = 1; i < num_of_students; i++){
            if(marks[hm] < marks[i]){
                hm = i;
            }
            else if(marks[lm] > marks[i]){
                lm = i;
            }
            sum += marks[i];
        }

        avg = (double)sum/num_of_students;
        num_of_below_avg_students = 0;
        for(i = 0; i < num_of_students; i++){
            if(marks[i] < avg){
                num_of_below_avg_students++;
            }
        }

        System.out.print("\nHighest mark: " + marks[hm]);
        System.out.print("\nLowest mark: " + marks[lm]);
        System.out.print("\nClass Average: " + String.format("%.2f", avg));
        System.out.print("\nNumber of students below class average: " 
            + num_of_below_avg_students);
    }
}