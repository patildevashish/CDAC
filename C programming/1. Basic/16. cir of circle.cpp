/* WAP to calculate the circumference of the circle. (2*pi*r) */
#include<stdio.h>

int main()
{
    float r, pi = 3.14, circum;
    printf("Enter the radius of circle: ");
    scanf("%f",&r);
    circum = 2 * pi * r;
    printf("the circumference of the circle: %.2f",circum);
}