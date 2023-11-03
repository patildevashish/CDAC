import java.util.Scanner;

public class Students {
    int m1, m2, m3, m4, m5;
    float total;
    
    void input()
    {
        System.out.println("Enter the marks for 5 subjects");
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();
    }
    void calc()
    {
        float per;
        float marks;
        marks = m1+m2+m3+m4+m5;
        System.out.println("Your scored marks: "+marks);
        total = marks/250;
        per = total * 100;
        if (per>=90 && per<=100) 
        {
            System.out.println("Your Percentage is "+per+" and score A+ grade");    
        }
        else if (per>=80) 
        {
            System.out.println("Your Percentage is "+per+" and score A grade");
        }
        else if (per>=70) 
        {
            System.out.println("Your Percentage is "+per+" and score B+ grade");    
        }
        else if (per>=60) 
        {
            System.out.println("Your Percentage is "+per+" and score B grade");    
        }
        else if (per>=50) 
        {
            System.out.println("Your Percentage is "+per+" and score C grade");    
        }
        else
        {
            System.out.println("Your Percentage is "+per+" and you are Failed");    
        }
    }
    public static void main(String ar[])
    {
        Students s = new Students();
        s.input();
        s.calc();
    }
}