// wap to print prime nos using function
#include<stdio.h>
int fact(int);
int main()
{
    int a,c;
    printf("enter any no: ");
    scanf("%d",&a);
    c=fact(a);
    printf("\nThe factor of no is: %d",c);
    
}
int fact(int a)
{
    int i,fact=1;
    
    for ( i = 1; i <= a; i++)
    {
        fact= fact * i;
    }
    return fact;
    
}