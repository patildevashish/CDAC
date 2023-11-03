//Create a function template 
#include <iostream>
using namespace std;

template <class t>
t add(t a, t b)
{
    return a+b;
}

int main()
{
    int x = 43, y = 45, z;
    z = add(x,y);
    cout << "Addition = " << z << endl;
}