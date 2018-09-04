// @author: Akshay Sharma(akshay31057)

// Program to illustrate functions

#include<stdio.h>

void print(int a, int c)
{

    for(int i=c; i>=0; i--)
    {
        printf("%d\t",i);
    }
    printf("\n");
}
int main()
{
    int i;
    print(4,5);
    return 0;
}
