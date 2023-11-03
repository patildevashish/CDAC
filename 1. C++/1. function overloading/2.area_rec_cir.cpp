/* WAP to find area of rectangle and area of circle*/
#include<iostream>
using namespace std;

int area(int,int);
float area(int);
int main()
{
    int a,b,y,r;
    float c;
    cout<<"\nenter length and breath of rectangle: ";
    cin>>a>>b;
    r=area(a,b);
    cout<<"\nThe area of rectangle is: "<<r;
    cout<<"\nenter radius of circle: ";
    cin>>y;
    c = area(r);
    cout<<"\nThe area of circle is: "<<c;

}
int area(int a, int b) 
{
    int area2;
    area2 = a * b;
    return area2;
}
float area(int y)
{
    float area1;

    area1 = 3.14 * y* y;
    return area1;
}