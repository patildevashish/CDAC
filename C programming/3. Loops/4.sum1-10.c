/* wap to print sum of first 10 numbers*/
#include<stdio.h>

int main()
{
    int a=1, sum=0;
    while (a<=10)
    {
        sum=sum+a;
        a++;
    }
    printf("%d\n",sum); 
}