/*WAP to calculate the sum of individual digit of a 4 digit number. (d1=n%10;n=n/10)*/
#include<stdio.h>

int main()
{
    int n,a,b,c,d,e;
    printf("Enter the 4 digit no: ");
    scanf("%d",&n);
    a = n / 1000;
    b = n / 100 %10;
    c = n / 10 % 10;
    d = n % 10;
    e = a + b + c + d;
    printf("The sum of individul no is: %d",e);
}