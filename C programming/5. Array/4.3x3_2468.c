// add of 2d array
//i0j1 + i1j0 +i1j2=i2j1
#include<stdio.h>
int main()
{
    int a[3][3],i,j,sum=0;
    printf("\nEnter the numbers\n");
    for ( i = 0; i < 3; i++)
    {
        for ( j = 0; j < 3; j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    printf("\n Matrix");
    for ( i = 0; i < 3; i++)
    {
        for ( j = 0; j < 3; j++)
        {
            printf("\t%d",a[i][j]);
        }
        printf("\n");
    }
    printf("addition of no is: ");
    for ( i = 0; i < 3; i++)
    {
        for ( j = 0; j < 3; j++)
        {
            if (i+j==1 || i+j==3)
            {
                sum=sum + a[i][j]; 
            }
        }
    }
    printf("%d",sum);
}