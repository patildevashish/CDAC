/* WAP to check whether a number is divisible according to the following codin
1. no is divisible by 8 and 5
2. no is divisible by 8
3. no is divisible by 5
4. no is divisible neither by 5 nor by 8.*/

#include<stdio.h>

int main()
{
    int a;
    printf("Enter the number: ");
    scanf("%d",&a);
    if (a%8==0 && a%5==0)
    {
        printf("%d is divisible by 8 and 5",a);
    }
    else if (a%8==0)
    {
        printf("%d is divisible by 8",a);
    }
    else if (a%5==0)
    {
        printf("%d is divisible by 5",a);
    }
    else printf("%d is divisible neither by 5 nor by 8.",a);
}