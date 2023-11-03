#include <iostream>
using namespace std;

template < class t1, class t2 >
t1 smaller (t1 x, t2 y)
{
    return (x < y ? x : y);
}

int  main()
{
    int a = 89;
    float b = 67.98;
    cout << smaller (a, b) << endl;
}