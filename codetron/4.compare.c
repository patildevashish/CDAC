// Write a program to compare two no by using the ternary operator in c
#include <stdio.h>
int main() 
{
    int a,b;
    printf("Enter two nos: ");
    scanf("%d%d",&a,&b);
    
    printf("\nThe larger one is %s",(a > b) ? "A" : (b > a)? "B":"Both are equal");
    }
    