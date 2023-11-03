// add of 2d array
//i0j0 + i0j2 +i1j1+ i2j0 + i2j2
#include<stdio.h>
int main()
{
    int a[3][3],i,j,sum=0;
    printf("Enter elements of matrix: ");
    for ( i = 0; i < 3; i++)
    {
        for ( j = 0; j < 3; j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    printf("\nMatrix ");
    for ( i = 0; i < 3; i++)
    {
        for ( j = 0; j < 3; j++)
        {
            printf("\t%d",a[i][j]);
        }
        printf("\n");
    }
    printf("Addition of nos is: ");
    for ( i = 0; i < 3; i++)
    {
        for ( j = 0; j < 3; j++)
        {
            if (i==j || i+j==2)
            {
                sum=sum + a[i][j]; 
            }
        }
    }
    printf("%d",sum);
}