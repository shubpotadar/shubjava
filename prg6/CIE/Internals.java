package CIE;
import java.util.Scanner;

public class Internals {
    Scanner sc= new Scanner(System.in);
    public static int marks[] = new int[5];
    public static int credits[] = new int[5];
    public void marks(){
        System.out.println("Enter the internal marks of 5 subjects");
        for (byte i = 0; i < 5; i++) {
            marks[i]=sc.nextInt();
        }
        System.out.println("Enter the credits of 5 subjects");
        for (byte i = 0; i < 5; i++) {
            credits[i]=sc.nextInt();
        }        
    }
}
