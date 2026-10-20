package MyArrays.TwoDimensionalArray;
import java.util.Scanner;


/**
 * Write a description of class ImageManipulatuion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ImageManipulatuion
{
    //Display the image pixel matrix
    public static void display(int[][] image){
        //write your code here
    }
    
    //Increase / Decrease brightness
    public static void adjustBrightness(int[][] image, int amount){
        //write your code here
        
        //Keep pixel values between 0 and 255
        
    }
    
    //Reverse the pixel in each row
    public static void horizontalFlip(int[][] image){
        //write your code here
    }
    
    //Reverse the order of rows
    public static void verticalFlip(int[][] image){
        
    }
    
    //Invert every pixel
    public static void invertImage(int[][] image){
        //write your code here
    }
    
    public static void main(String[] args){
        System.out.print("\f");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter image height(number of rows): ");
        int h = sc.nextInt();
        System.out.print("Enter image width(pixels per row): ");
        int w = sc.nextInt();
        
        if(h <= 0 || w <= 0){
            System.out.print("Dimensions must be greater than zero!");
            sc.close();
            return; //exit from main()
        }
        
        int[][] image = new int[h][w];
        System.out.print("\nEnter pixel values(0 to 255):\n");
        int i, j;
        for(i = 0; i < h; i++){
            for(j = 0; j < w; j++){
                int value = sc.nextInt();
                if(value < 0 || value > 255){
                    System.out.print("\nInvalid pixel value. Enter a value from 0 to 255.\n");
                    sc.close();
                    return;
                }
                image[i][j] = value;
            }
        }
        
        int choice;
        do{
            System.out.print("\n=====MENU=====");
            System.out.print("\n1. Display image");
            System.out.print("\n2. Increase Brightness");
            System.out.print("\n3. Decrease Brightness");
            System.out.print("\n4. Horizontal flip");
            System.out.print("\n5. Vertical flip");
            System.out.print("\n6. Inverted image");
            System.out.print("\n0. Exit ");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    display(image);
                    break;
                    
                case 2:
                    System.out.print("Enter brightness increase: ");
                    int inc = sc.nextInt();
                    if(inc < 0){
                        System.out.print("\nEnter a non-negative amount.\n");
                    }
                    else{
                        adjustBrightness(image, inc);
                        System.out.print("\nBrightness increased.\n");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter brightness decrease: ");
                    int dec = sc.nextInt();
                    if(dec < 0){
                        System.out.print("\nEnter a non-negative amount.\n");
                    }
                    else{
                        adjustBrightness(image, -dec);
                        System.out.print("\nBrightness decreased.\n");
                    }
                    break;
                    
                case 4:
                    horizontalFlip(image);
                    System.out.print("\nImage flipped horizontally.");
                    break;
                    
                case 5:
                    verticalFlip(image);
                    System.out.print("\nImage flipped vertically.");
                    break;
                    
                case 6:
                    invertImage(image);
                    System.out.print("\nImage inverted.");
                    break;
                    
                case 0:
                    System.out.print("\nExiting program");
                    break;
                    
                default:
                    System.out.print("\nInvalid choice. Try again.\n");
            }
        }while(choice != 0);
        sc.close();
    }
}