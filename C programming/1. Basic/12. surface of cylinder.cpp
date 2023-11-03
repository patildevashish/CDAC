/*WAP to calculate the surface of the cylinder.(2*pi*r*h)*/

#include<stdio.h>

int main()
{
    float r,h,pi = 3.14, s_cylinder;
    printf("Enter the radius and height of cylinder: ");
    scanf("%f%f", &r,&h);
    s_cylinder = 2 * pi * r * h;
    printf("The surface of cylinder is: %.2f",s_cylinder);
}