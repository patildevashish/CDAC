/* WAP to interchange the values of two variables with using third variable.*/

#include<stdio.h>

int main()
{
    int a,b,c;
    printf("The the variable: ");
    scanf("%d%d",&a,&b);
    c=a;
    a=b;
    b=c;
    printf("%d \t %d",a,b);
}