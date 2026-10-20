package ClassAndObjects;
import java.util.*;


/**
 * Write a description of class RoadTax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RoadTax
{
    String name, model;
    int yearOfPurchase, currentYear;
    double price;
    
    // to accept all details
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Customer Name: ");
        name = sc.nextLine();
        System.out.print("Enter model of car: ");
        model = sc.nextLine();
        System.out.print("Enter year of purchase: ");
        yearOfPurchase = sc.nextInt();
        System.out.print("Enter current year: ");
        currentYear = sc.nextInt();
        System.out.print("Enter price of the car: ");
        price = sc.nextDouble();
    }
    
    //to calculate the tax to be paid based on the given condition
    void compute(){
        int numOfYears = currentYear - yearOfPurchase;
        double tax;
        if(numOfYears > 10){
            tax = 50000;
        }
        else if(numOfYears > 5){
            tax = price * 0.2;
        }
        else{
            tax = price * 0.3;
        }
        System.out.print("\nTax: \u20b9" + tax );
    }
    
    //to display all details
    void display(){
        System.out.print("\nCustomer name: " + name +
        "\nCar Model: " + model + 
        "\nYear of purchase: " + yearOfPurchase +
        "\nCurrent year: " + currentYear + 
        "\nPrice of the car: " + price);
        compute();
    }
    
    public static void main(String []args){
        System.out.print("\f");
        RoadTax rt = new RoadTax();
        rt.accept();
        rt.display();
    }
}