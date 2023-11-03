/*WAP to calculate the total and avg of five subjects.*/

#include<stdio.h>

int main()
{
    float a, b, c, d, e, total, avg;
    printf("Enter the marks for 5 subjects: ");
    scanf("%f%f%f%f%f",&a, &b, &c, &d, &e);
    total = a + b + c + d + e;
    avg =  (a + b + c + d + e)/2;
    printf("The total marks are: %f", total);
    printf("\nAvg: %f", avg);
}