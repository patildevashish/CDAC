/* WAP to calculate area of circle (a_cir=pi*r*r)*/

#include<stdio.h>

int main()
{
    float r, pi = 3.14, a_cir;
    printf("Enter the radius of circle: ");
    scanf("%f",&r);
    a_cir = pi * r * r;
    printf("The area of circle is: %.2f",a_cir);
}