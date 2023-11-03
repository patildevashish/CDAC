// WAP to swap two nos
#include<stdio.h>
void  Swap(int,int);
int main()
{
    int a,b;
    printf("Enter the numbers: ");
    scanf("%d%d",&a,&b);
     Swap(a,b);
 //printf("swaping of 2 nos is %d",ans);
}
void Swap(int x, int y)
{
    int z;
    z= x;
    x = y;
    y = z;
    printf("values after swapping x=%d and y=%d",x,y);
}