package ClassAndObjects;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    int roll_num;
    String name;
    int age;
    
    void display(){
        System.out.print("\nroll_num = " + roll_num);
        System.out.print("\nname = " + name);
        System.out.print("\nage = " + age);
    }
    
    Student(){} //Default constructor
    Student(int rn, String nm){
        this(rn, nm, 0); //calling another constructor
    }
    
    Student(Student s){
        roll_num = s.roll_num;
        name = s.name;
    }
    
    Student(int roll_num, String name, int age){
        this.roll_num = roll_num;
        this.name = name;
        this.age = age;
    }
    
    public static void main(String[] args){
        System.out.print("\f");
        Student s1 = new Student(1001, "Joseph");
        Student s2 = new Student(1002, "Shiv");
        
        s1.display();
        s2.display();
        
        Student s3 = new Student(s2);
        System.out.print("\nCopy of s2 object.");
        s3.display();
        
        Student s4 = new Student();
        s4.roll_num = s1.roll_num;
        s4.name = s1.name;
        
        System.out.print("\nCopied values without calling a constructor");
        s4.display();
        
        Student s5 = new Student(1005, "Kapil", 21);
        s5.display();
    }
}


