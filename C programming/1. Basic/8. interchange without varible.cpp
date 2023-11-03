/*WAP to interchange the values of two variables without using third variable.*/
#include<stdio.h>

int main()
{
    int a,b;
    printf("Enter the two variables: ");
    scanf("%d%d",&a,&b);
    a=a+b;
    b=a-b;
    a=a-b;
    printf("The interchange value is: %d \t %d",a,b);
}