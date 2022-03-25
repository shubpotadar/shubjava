import java.util.*;
public class Quaroot{
public static void main(String args[]){
    int a,b,c;
    float r1,r2,dis;
    System.out.println("enter the values of a ,b,c:");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    dis=(b*b)-(4*a*c);
    if(dis>0){
        r1=((-1*b)+(float)(Math.sqrt(dis)))/(2*a);
        r2=((-1*b)-(float)(Math.sqrt(dis)))/(2*a);
        System.out.println("The roots are "+r1+"and "+r2);
    }
    else if(dis==0){
        r1=r2=(-1*b)/(2*a);
        System.out.println("The roots are "+r1+"and "+r2);
    }
        else{
            System.out.println("There are no real solutions");
        }
    }
}