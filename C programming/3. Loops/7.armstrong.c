/* wap to find given no. is armstrong or not*/
#include<stdio.h>

int main()
{
    int num,r,c,sum=0,temp;
    printf("enter the no: ");
    scanf("%d",&num);
    temp=num;
    while (num!=0)
    {
        r = num % 10;
        c = r * r * r;
        sum = sum +c;
        num = num / 10;
    }
    if (temp==sum)
    {
        printf("%d is armstrong no.",temp);
    }
    else 
    {
        printf("%d is not an armstrong number",temp);
    }
}