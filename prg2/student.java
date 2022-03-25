import java.util.*;
class student{
    String usn, name;
    int credits[]= new int[6];
    int marks[]= new int[6];
    byte i;
    int result=0,tot_credits=0;
    double sgpa=0;
    
void input(){
    System.out.print("Enter the details:\nName:");
    Scanner sc= new Scanner(System.in);
    name=sc.nextLine();
    System.out.print("USN:");
    usn=sc.nextLine();
    System.out.println("Enter the credits and marks of all subjact");
    for(i=0;i<6;i++){
        System.out.println("Enter subject"+(i+1)+" credit & marks");
        credits[i]=sc.nextInt();
        marks[i]=sc.nextInt();
    }
    }
void compute(){
    for(i=0;i<6;i++){
       if(marks[i]>=90){
           result=result+credits[i]*10;
       }
       else if(marks[i]>=80){
           result=result+credits[i]*9;
       }
       else if(marks[i]>=70){
           result=result+credits[i]*8;
       }
       else if(marks[i]>=60){
           result=result+credits[i]*7;
       }
       else if(marks[i]>=50){
           result=result+credits[i]*6;
       }
       else if(marks[i]>=40){
           result=result+credits[i]*5;
       }
       else 
            result=result+credits[i]*0;
       
    }
    for(i=0;i<6;i++){
        tot_credits=credits[i]+tot_credits;
        }
    sgpa=(result/tot_credits);
    }    
void output(){
    System.out.println("The student sgpa is\nName:"+name+"\nUSN:"+usn+"\nSGPA:"+sgpa);
    }    
public static void main(String args[]){
    student obj= new student();
    obj.input();
    obj.compute();
    obj.output();
}    
}