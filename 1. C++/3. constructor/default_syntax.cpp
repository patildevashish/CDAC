//calculater area of rectangle and perimeter of rectangle using constructor
#include<iostream>
using namespace std;
class rectangle
{
private:
    int l,b;
public:
    rectangle()
    {
        cout<<"\nEnter length & breath of rectangle: ";
        cin>>l>>b;
    }
    void area()
    {
        int a = l*b;
        cout<<"\nArea of rectangle: "<<a;
    }

};
int main()
{
    rectangle r;
    r.area();
}

