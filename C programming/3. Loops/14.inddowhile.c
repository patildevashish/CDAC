/* WAP TO PRINT SUM OF INDIVIDUAL FIVE DIGIT NO.*/
#include<stdio.h>

int main()
{
    int a,sum=0,b;
    printf("Enter the five digit no: ");
    scanf("%d",&a);
    do  
    {
        b = a%10;
        sum = sum + b;
        a = a/10;
    }
    while (a!=0);
    printf("%d",sum);
}