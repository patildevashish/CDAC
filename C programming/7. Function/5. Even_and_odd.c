//WAP to print no is even or odd
#include<stdio.h>
int pr(int);
int main()
{
    int a;
    printf("Enter any no: ");
    scanf("%d",&a);
    pr(a);
}
int pr(int b)
{
    if (b%2==0)
    {
        printf("The no is even");
    }
    else printf("Number is odd");
    return b;
}