#include <iostream>
using namespace std;
template < class cube>
cube is(cube y)
{
    
    return (y*y*y);
}
template < class square>
square got(square x)
{
    return (x*x);
}
int main()
{
    int a, b, res, sq;
    cout << "Enter the value of numbers: ";
    cin >> a;
    sq = got(a);
    res = is(a);
    cout << "Square of first number is: " << sq << endl;
    cout << "Cube of second number is: " << res << endl;
}