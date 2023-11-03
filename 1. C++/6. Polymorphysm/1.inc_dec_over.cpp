//wap to increment and decrement overloading
#include<iostream>
using namespace std;

class over
{
    private: int a,b; 
    public:
        void operator ++()
        {
            cout << "Enter any number: ";
            cin >> a >> b;
            a++;
            b--;
        }

        void show()
        {
            cout << "increment is: "<<a++;
            cout << "\ndecrement is: "<<b--;
        }
};
int main()
{
    over o;
    ++o;
    o.show();
}