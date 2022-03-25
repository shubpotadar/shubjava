

abstract class Shape{
    double d1;
    double d2;
    Shape(double d1,double d2)
    {
        this.d1=d1;
        this.d2=d2;
    }
    Shape(double r)
    {
        d1=r;
    }
    abstract double printarea();
    
}

class triangle extends Shape{
    triangle(double a,double b)
    {	super(a,b);
        
    }
    double printarea()
    {
        System.out.println("Area of the triangle:");
        return (d1*d2*0.5);
    }
}
class rectangle extends Shape{
    rectangle(double a,double b)
    {	super(a,b);
        
    }
    double printarea()
    {
        System.out.println("Area of the rectangle:");
        return (d1*d2);
    }
}
class circle extends Shape{
   circle(double a)
    {	super(a);
        
    }
    double printarea()
    {
        System.out.println("Area of the circle:");
        return (d1*d1*3.14);
    }
}
 class Main
{   public static void main(String args[])
    {
        
        triangle t=new triangle(3,2);
        rectangle r=new rectangle(4,2);
        circle c=new circle(3);
        System.out.println(t.printarea());
        System.out.println(r.printarea());
        System.out.println(c.printarea());
    }
    
}