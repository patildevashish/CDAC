// WAP to create a template function something different
# include <iostream>
using namespace std;

template <class t>
t square (t a)
{
    return a*a;
}

int main()
{
    int b = 20, c;
    c = square(b);
    cout << "Square is: "<< c << endl;
}