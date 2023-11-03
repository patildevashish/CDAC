/* WAP to add, sub, mul, div, mod two variables and print the result*/
#include<stdio.h>

int main()
{
    int a,b,c,d,e,g;
    float f;
    printf("Enter two variables: ");
    scanf("%d%d",&a,&b);
    c = a + b;
    d = a - b;
    e = a * b;
    f = a / b;
    g = a % b;
    printf("The add of of variable is: %d",c);
    printf("\n The sub of variable is: %d",d);
    printf("\n The mul of variable is: %d",e);
    printf("\n The div of variable is: %.2f",f);
    printf("\n The mod of variable is: %d",g);
}