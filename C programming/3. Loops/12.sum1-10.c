/* wap to print sum of first 10 numbers using do while*/
#include<stdio.h>

int main()
{
    int l=1,sum=0;
    do
    {
        sum = sum+l;
        l++;
        
        
    } while (l<=10);
    printf("%d\n",sum);
}