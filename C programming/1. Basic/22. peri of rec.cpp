/* WAP to calculate the perimeter of the rectangle.(2*(l+b)).*/
#include<stdio.h>

int main()
{
    int l, b, peri;
    printf("Enter the length and breath of rectangle: ");
    scanf("%d%d",&l,&b);
    peri = 2 * (l + b);
    printf("The Perimeter of rectangle is: %d",peri);
}