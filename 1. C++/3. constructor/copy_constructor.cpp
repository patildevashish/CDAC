//copy constructor
#include<iostream>
using namespace std;

class Rectangle
{
    private:
        int l,b;
    public:
        Rectangle()
        {
            l=25;
            b=30;
        }

        Rectangle(Rectangle &r)
        {
            l = r.l;
            b = r.b;
        }

        void area()
        {
            int a = l*b;
            cout<<"\nArea is: "<<a;
        }
};

int main()
{
    Rectangle R;
    // R.area();
    Rectangle obj(R);
    obj.area();
}