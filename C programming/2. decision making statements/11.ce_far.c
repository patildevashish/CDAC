/* WAP to convert celsius to fahrenheit and vice versa*/

#include<stdio.h>

int main()
{
    int a,f,c,d,e;
    printf(" Select one option");
    printf("\n1. celsius to fahrenheit \n2. fahrenheit to celsius\n");
    scanf("%d",&a);
    switch (a)
    {
    case 1:
        printf("Enter value in celsius: ");
        scanf("%d",&d);
        f = (1.8* d) + 32;
        printf("temp in fahrenheit is: %d",f);
        break;
    case 2:
        printf("Enter temp in fahrenheit: ");
        scanf("%d",&e);
        c = ((e - 32) / (1.8));
        printf("temp in fahrenheit is: %d",c);
        break;
    default:
        printf("Enter correct no");
        break;
    }
}