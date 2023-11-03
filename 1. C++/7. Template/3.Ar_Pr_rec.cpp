//WAP to convert decimal number to binary number using friend function in c++
#include<iostream>
using namespace std;
class length
{
        int a;
    public:
        length()
        {
            cout << "Enter the length of rectangle: ";
            cin>>a;
        }
        friend void area();
};
class breath
{
    int b;
        breath()
        {
            cout << "Enter the breath of rectangle: ";
            cin >> b;
        }
        friend void area();
};

void area()
{
    length l;
    breath br;
    int area, perimeter;
    area = l.a * br.b;
    perimeter = 2*(l.a + br.b);
    cout << "Area of rectangle is:  " << area;
    cout << "\nPerimeter of rectangle is: " << perimeter;
}

int main()
{
    area();
}