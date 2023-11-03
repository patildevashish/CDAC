/* WAP to convert the temperature Fahrenheit degree into degree celcius.
Celsius = ((Fahrenheit - 32) / (1.8)) & Fahrenheit = (1.8* Celsius) + 32;*/

#include<stdio.h>

int main()
{
    int h;
    float f, c, a, b;
    printf("Select in which you have to convert\n");
    printf("1. Fahrenheit \n2. Celsius\n");
    scanf("%d",&h);
    switch (h)
    {
    case 1:
        printf("Enter the temp in celsius: ");
        scanf("%f",&a);
        f = (1.8* a) + 32;
        printf("The temp in fahrenheit is: %f",f);
        break;
    case 2:
         printf("Enter the temp in Fahrenheit: ");
        scanf("%f",&b);
        c = ((b - 32) / (1.8));
        printf("The temp in Celsius is: %f",c);
        break;
    
    default:
        printf("Enter the valid no.");
    
    }
}