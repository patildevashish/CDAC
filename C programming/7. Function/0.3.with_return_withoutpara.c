//with_return_without para
#include<stdio.h>
int Add (void);
int main()
{
    int ans;
    ans= Add();
    printf("%d",ans);
}
int Add (void)
{
    int a,b,c;
    a = 10, b=40;
    c = a + b;
    return c;
}