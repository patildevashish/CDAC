/* WAP  to check greater of five nos.*/
#include<stdio.h>

int main()
{
    int a,b,c,d,e;
    printf("Enter the five nos: \n");
    scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
    if (a>b && a>c && a>d && a>e)
    {
        printf("%d is greater",a);
    }
    else if (b>c && b>d && b>e)
    {
        printf("%d is greater",b);
    }
    else if (c>d && c>e)
    {
        printf("%d is greater",c);
    }
    else if (d>e)
    {
        printf("%d is greater",d);
    }
    else if (e>a && e>b && e>c && e>d)
    {
        printf("%d is greater",e);
    }
    else printf("Number are equal");
}