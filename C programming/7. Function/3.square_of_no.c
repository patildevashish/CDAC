//WAP to print square of a no
#include<stdio.h>
int sq(int a, int b);
int main()
{
    int a,b;
    printf("Enter a number: ");
    scanf("%d",&a);
    b = a * a;
    printf("The square of a no is: %d",b);
}
int sqa(int x)
{
    int y;
    y = x*x;
    return y;
}