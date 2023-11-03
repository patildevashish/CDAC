/* WAP to check greater of three nos*/

#include<stdio.h>

int main()
{
    int a,b,c;
    printf("enter the three nos: \n");
    scanf("%d%d%d",&a, &b, &c);
    if (a>b && a>c)
    {
        printf("a is greater than b and c\n");
    }
    else
        if (a<b && b>c)
        {
            printf("b is greater than a and c");
        }
        else
        {
            printf("c is greater");
        }
}