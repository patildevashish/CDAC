/* WAP to calculate the third angle when two angles are input through the keyboard.*/
#include<stdio.h>

int main()
{
    float a,b,c;
    printf("Enter the angles: ");
    scanf("%f%f",&a,&b);
    c = 180 - a - b;
    printf("The third angle is: %.2f",c);
}