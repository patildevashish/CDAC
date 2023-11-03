// With parameter without return type
#include<stdio.h>
void Add(int,int);
int main()
{
     int a,b;
     scanf("%d%d",&a,&b);
     Add(a,b);
}
void Add (int x, int y)
{
    printf("Addition = %d",x+y);
}