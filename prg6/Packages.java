import CIE.*;
import SEE.External;
public class Packages {

    public static void main(String[] args) {
        Students su=new Students();
        Internals i=new Internals();
        External e= new External();
        su.input();        
        i.marks();
        e.see();
        su.output();
        double finalmarks[];
        finalmarks = new double[5];
        System.out.println("Final marks");
        for (int j = 0; j < 5; j++) {
            finalmarks[j]=(double) (External.marks[j]*0.5)+(double)(Internals.marks[j]);
            System.out.println("Subject"+(j+1)+": "+finalmarks[j]);
        }
        
    }
}
