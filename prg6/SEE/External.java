package SEE;
import java.util.Scanner;
import CIE.Students;
public class External extends Students{
    public static int marks[]=new int[5];
    Scanner sc =new Scanner(System.in);
    public void see(){
        System.out.println("Enter the see marks of the subjects");
        for(byte i=0; i<5 ; i++)
            marks[i]=sc.nextInt();
    }
}
