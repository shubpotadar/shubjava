package CIE;
import java.util.Scanner;

public class Students {
    Scanner sc=new Scanner(System.in);
    public String name,USN;
    public int sem;
       
    public void input(){
    System.out.print("Enter the name: ");
    name=sc.nextLine();
    System.out.print("Enter USN: ");
    USN=sc.nextLine();
    System.out.print("Enter sem: ");
    sem=sc.nextInt();
    }
    public void output(){
        System.out.println("Name: "+name.toUpperCase()+"\nUSN: "+USN.toUpperCase()+"\tSEM: "+sem);
    }
}
