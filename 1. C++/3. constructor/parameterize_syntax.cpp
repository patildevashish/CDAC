//parameterize constructor
#include<iostream>
using namespace std;
class Rectangle
{
    private: int l, b;

    public:
        Rectangle(int x, int y)
        {
            l = x;
            b = y;
        }
        void area()
        {
            int a = l * b;
            cout<<"\nArea is: "<<a;
        }
};
int main()
{
    int a,b;
    cout<<"\nEnter length & breath: ";
    cin>>a>>b;

    Rectangle obj(a,b);
    obj.area();
}