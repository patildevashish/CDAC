// WAP to find area of rectangle
#include<stdio.h>
int area(int a, int b);
int main()
{
    int a,b,ar;
    printf("Enter length and breath: ");
    scanf("%d%d",&a,&b);
    ar = a*b;
    printf("Area of rectangle is: %d",ar);
}
int area(int x, int y)
{
    int z;
    z = x *y;
    return z;
}