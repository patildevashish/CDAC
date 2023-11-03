/* WAP TO PRINT SUM OF INDIVIDUAL FIVE DIGIT NO.*/
#include<stdio.h>

int main()
{
    int a,sum=0,b;
    printf("Enter the five digit no: ");
    scanf("%d",&a);
    while (a!=0)
    {
        b = a%10;
        sum = sum + b;
        a = a/10;
    }
    printf("%d",sum);
}