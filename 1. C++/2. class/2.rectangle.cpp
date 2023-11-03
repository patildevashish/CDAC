//calculater area of rectangle and perimeter of rectangle
#include<iostream>
using namespace std;
class rectangle
{
    private:
        float l,b;
    public:
    void input();
    void area();
    void perimeter();
}; 
    void rectangle::input()
    {
        cout<<"\nEnter length and breath of rectangle: ";
        cin>>l>>b;
        
    }
    void rectangle::area()
    {
        float a = l*b;
        cout<<"Area of rectangle is: "<<a;
    }
    void  rectangle::perimeter()
    {
        float p;
        p = 2*(l+b);
        cout<<"\nPerimeter of rectangle is: "<<p;
    }
    int main()
    {
        rectangle r;
        r.input();
        r.area();
        r.perimeter();
    }
