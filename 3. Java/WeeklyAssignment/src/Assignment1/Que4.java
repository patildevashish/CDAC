
package Assignment1;

abstract class GeometricShape{
    protected double len;
    protected double wid;
    protected double heigth;
    protected double base;
    protected double side;
	   
    GeometricShape(double l,double w)
    {
        len=l;
        wid=w;
    }
    GeometricShape(double h,double b,double s)
    {
        heigth=h;
        base=b;
        side=s;
    }
        abstract void area();
        abstract void perimeter();
}
class Triangle extends GeometricShape
{
    double ar;
    double peri;
    Triangle(double h,double b,double s)
    {
       super(h,b,s);
    }
    void area()
    {
        ar=(heigth*base);
        ar=ar/2;
        System.out.println("Area of Triangle is: "+ar);
    }
    void perimeter()
    {
        peri=3*side;
        System.out.println("Perimeter of Triangle is: "+peri);
    }
}
class Reactangle extends GeometricShape
{
    double ar;
    double peri;
    Reactangle(double l,double w)
    {
        super(l,w);
    }
    void area()
     {
        ar=len*wid;
        System.out.println("Area of Reactangle is: "+ar);
     }
     void perimeter()
     {
        peri=2*(len+wid);
        System.out.println("Perimeter of Reactangle is: "+peri);
     }
}
public class Que4 {
    public static void main(String[] args) {
    Reactangle r = new Reactangle(4.5,7.8);
    r.area();
    r.perimeter();
    System.out.println("***********************************");
    Triangle t = new Triangle(2.6,4.3,5);
    t.area();
    t.perimeter();  
    }
}