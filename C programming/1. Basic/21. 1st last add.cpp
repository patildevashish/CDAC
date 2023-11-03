/*Input a four digit number from the keyboard. WAP to obtain sum of first and last digit of
the number.*/

#include<stdio.h>

int main()
{
    int n,a,b,c;
    printf("Enter the 4 digit no: ");
    scanf("%d",&n);
    a = n / 1000;
    b = n % 10;
    c = a + b;
    printf("The sum of digit is: %d",c);
}