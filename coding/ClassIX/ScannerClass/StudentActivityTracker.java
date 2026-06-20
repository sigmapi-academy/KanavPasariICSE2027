package ScannerClass;

import java.util.Scanner;
/**
 * Write a description of class PROJECT1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentActivityTracker
{
    public static void main(String args[])
    {
        System.out.print("\f\nSTUDENT ACTIVITY TRACKER");
        Scanner sc = new Scanner (System.in);
        System.out.print("\nEnter your name: ");
        String name = sc.nextLine();
        int i=1, n=7, cnt=0;
        double h, sum=0.0d, avg, highestStudyHour = 0;
        do
        {
            System.out.print("Enter no. of hours studied for day "+i+": ");
            h=sc.nextDouble();
            if(h>15.0||h<0.0)
            {
                System.out.print("\nInvalid input! Please enter hours between 0 and 15.");
                n++;
                continue;
            }
            else
            {
                sum+=h;
            }
            if(h>5.0)
            {
                cnt++;
            }
            if(highestStudyHour < h){
                highestStudyHour = h;
            }
        }while(++i<=n);
        avg=sum/7.0;
        System.out.println("\n\n----- Weekly Study Report -----");
        System.out.println("Student Name: "+name);
        System.out.println("\n\nTotal study hours of the week: "+sum);
        System.out.println("Average study hours of the week: "+String.format("%.2f",avg));
        System.out.println("Number of days the student studied more than 5 hours: "+cnt);
        System.out.println("Highest study hours in a single day: " + highestStudyHour);
        if(avg>=8)
            System.out.println("Performance: Excellent study routine!");
        else if(avg>=5)
            System.out.println("Performance: Good, but you can improve.");
        else
            System.out.println("Performance: Needs more consistency.");
    }
}