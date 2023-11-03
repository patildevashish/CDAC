#include<stdio.h>

int main()
{
    int a;
    printf("enter the number from 1-4: ");
    scanf("%d",&a);
    switch (a)
    {
    case 1:
        printf("ONE");
        break;
    case 2:
        printf("TWO");
        break;
    case 3:
        printf("THREE");
        break;
    case 4:
        printf("FOUR");
        break;
    default:
        printf("enter correct number");
        break;
    }
}