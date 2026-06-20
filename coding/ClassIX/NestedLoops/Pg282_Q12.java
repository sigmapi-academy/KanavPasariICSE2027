package NestedLoops;
import java.util.*;

/**
 * Write a description of class Pg282_Q12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pg282_Q12
{
    public static void main(String[] args){
        System.out.print("\f");
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        final int sec = 4, numOfStudents = 40;
        int marks, count, i, j, maxCount = 0, whichSection = 1;
        for(i = 1; i <= sec; i++){
            count = 0;
            System.out.print("\nPercentage of marks for section: " + i);
            for(j = 1; j <= numOfStudents; j++){
                System.out.print("\nEnter percentage of marks: ");
                marks = rd.nextInt(80, 100);
                //marks = sc.nextInt(); //for school
                System.out.print(marks+"%");

                if(marks >= 95){
                    count++;
                    System.out.print("\t" + count);
                }
            }
            System.out.print("\nNumber of students got 95% or above in section "
                +i + " is: " + count);
            if(maxCount < count){
                maxCount = count;
                whichSection = i;
            }
        }
        System.out.print("\nSection with maximum student having marks >= 95%"
            +" is : " + whichSection + " and number of students: " + maxCount);
    }
}