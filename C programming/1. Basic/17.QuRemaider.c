/* WAP to compute Quotient and Remainder.*/
#include<stdio.h>

int main()
{
    int d,c,quo, r;
    printf("Enter the divident: ");
    scanf("%d",&c);
    printf("\nEnter the divisor: ");
    scanf("%d",&d);
    quo = c/d;
    r= c% d;
    printf("The quotient is: %d",quo);
    printf("The remainder is: %d",r);

}