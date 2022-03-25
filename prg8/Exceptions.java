import java.util.Scanner;
class fatherException extends Exception{
    public String toString(){
        return ("Father age is less than 0");
    }
}
class sonException extends Exception{
    int a;
    public sonException(int sonage) {
        a=sonage;
    }
    public String toString(){
        if(a<0)
        return ("Son age is less than 0");
        else
            return ("Son age is more than father age");
    }
}
class Father {
    public int age;
    Scanner sc=new Scanner(System.in);

    public Father() {
        System.out.print("Enter father's age: ");
        age=sc.nextInt();
    }
    void fun1()throws fatherException{
        if(age<0)
            throw new fatherException();
    }
}
class son extends Father{
    public int sonage;
    Scanner sa=new Scanner(System.in);
    public son() {
        System.out.print("Enter son age: ");
        sonage=sa.nextInt();
    }
    void fun2()throws sonException{
        if(sonage<0 || sonage>super.age)
            throw new sonException(sonage);
    }    
}
class Exceptions{
    public static void main(String[] args) {
        son s=new son();
        try{
            s.fun1();
        }
        catch(fatherException e){
            System.out.println(e);
        }
        try{
            s.fun2();
        }
        catch(sonException e){
            System.out.println(e);
        }
        System.out.println("Father's age: "+s.age);
        System.out.println("Son's age: "+s.sonage);
        
    }
}