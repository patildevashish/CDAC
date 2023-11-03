//with parameter with return type
#include<stdio.h>
int add(int,int);
int main()
{
    int a =20, b=30, c;
    c = add(a,b);
    printf("%d",c);
}
int add(int x, int y)
{
    return x+y;
}