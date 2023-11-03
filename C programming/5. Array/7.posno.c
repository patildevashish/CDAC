/* sorting of array*/
#include<stdio.h>

int main()
{
    int a[6],i,k;
    printf("Enter array: ");
    for ( i = 0; i < 6; i++)
    {
        scanf("%d",&a[i]);
    }
    printf("The array is:");
    for ( i = 0; i < 6; i++)
    {
        printf("\t%d",a[i]);
    }
    printf("\n");
    printf("enter element to sort: ");
    scanf("%d",&k);
    for ( i = 0; i < 6; i++)
    {
        if (i==k)
        {
            printf("array at point %d = %d\n",k,a[i]);
        }
    }
    
    
}
