// without return with parameter 
#include<stdio.h>
void Add (void);
main()
{
    Add();
}
void Add(void)
{
    int a=20, b=30;
    printf("Addition = %d",a+b);
}