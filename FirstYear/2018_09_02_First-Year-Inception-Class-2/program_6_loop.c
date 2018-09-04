// @author: Akshay Sharma(akshay31057)

// Program to illustrate the loop structure

#include<stdio.h>
int main()
{
    int i;
    /* for(initialization; condition-check; update)
    {
        code;
    }
    */
     int a = 0;
     int c = a++ + ++a; // Compiler dependent
     printf("c = %d and a = %d\n",c,a);

     for(i=0; i<10; i++)
     {
         printf("akshay\n");
         printf("%d\n",i + 1);
     }
     for(i = 1; i <= 10; i++)
         printf("%d\n",i);



    /*
    while(condition-true)
    {
        code;
    }
    */
    i=0;
    while(i<10)
    {
        printf("%d\n", i);
        i++;
    }
    i=0;
    /*
    do
    {
    }
    while(condition-is-true);
    */
    do
    {
        printf("%d\n", i++);

    }
    while(i<10);

    return 0;
}
