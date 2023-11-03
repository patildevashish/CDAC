//constructor
#include<iostream>
using namespace std;
class demo
{
private:
    int a,b;
public:
    demo()                  //default constructor
    {
        a =10;
        b =20;
    }

    demo(int x, int y)        //parameterized constructor
    {
        a=x;
        b=y;
    }
    demo(demo &ob)             // copy constructor
    {
        a=ob.a;
        b=ob.b;
    }
    void show()
    {
        cout<<"\nValue os A: "<<a;
        cout<<"\nValue of B: "<<b;
    }
    ~demo()
    {
        cout<<"\nDestructor called...............";
    }
};
int main()
{
    demo d,d1(2,3),d3(d);
    d.show();
    d1.show();
    d3.show();
}