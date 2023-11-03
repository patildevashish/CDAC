/* WAP to calculate simple interest. */

#include<stdio.h>

int main()
{
    float p, n, r, si;
    printf("Enter the percentage P: ");
    scanf("%f",&p);
    printf("Enter the net intrest R: ");
    scanf("%f",&r);
    printf("Enter the time T: ");
    scanf("%f",&n);
    si = (p * n * r)/100;
    printf("The simple interst SI is: %.2f",si);
}