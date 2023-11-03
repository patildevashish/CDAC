#include<stdio.h>
int main()
{
    int a,b,c,d,e;
    printf("Enter any 5 numbers: \n");
    scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
    if (a>b)
    {
        if (a>c)
        {
            if (a>d)
            {
                if (a>e)
                {
                    printf("%d is greater",a);
                }
                else 
                {
                    printf("%d is greater",e);
                }
            }
            else
            {
                if (d>e)
                {
                    printf("%d is greater",d);
                }
                else
                {
                    printf("%d is greater",e);
                }
            }
        }
        else
        {
            if (c>d)
            {
                printf("%d is greater",c);
            }
            else
            {
                printf("%d is greater",d);
            }
        }
    }
    else
    {
        if (b>c)
        {
            if (b>d)
            {
                if (b>e)
                {
                    printf("%d is greater",b);
                }
                else
                {
                    printf("%d is greater",e);
                }
            }
            else
            {
                if (c>d)
                {
                    printf("%d is greater",c);
                }
                else
                {
                    if (d>e)
                    {
                        printf("%d is greater",d);
                    }
                    else
                    {
                        printf("%d is greater",e);
                    }
                }
            }
        }
        else
        {
            if (c>d)
            {
                if (d>e)
                {
                    printf("%d is greater",d);
                }
                else
                {
                    printf("%d is greater",e);
                }
            }
            else
            {
                 if (d>e)
                {
                    printf("%d is greater",d);
                }
                else
                {
                    printf("%d is greater",e);
                }
            }
        }
    }
}