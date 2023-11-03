/* WAP  to check greater of four nos.*/
#include<stdio.h>

int main()
{
    int a,b,c,d;
    printf("Enter the four nos: \n");
    scanf("%d%d%d%d",&a,&b,&c,&d);
    if (a>b && a>c && a>d)
    {
        printf("%d is greater",a);
    }
    else if (b>c && b>d)
    {
        printf("%d is greater",b);
    }
    else if (c>d)
    {
        printf("%d is greater",c);
    }
    else if (d>a && d>b && d>c)
    {
        printf("%d is greater",d);
    }
    else printf("Number are equal");
}