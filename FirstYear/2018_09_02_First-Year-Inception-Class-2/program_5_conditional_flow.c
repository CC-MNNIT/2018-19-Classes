// @author: Akshay Sharma(akshay31057)

// Program to illustrate the conditional flow

#include<stdio.h>
int main()
{
    float cpi;
    printf("Enter the CPI\n");
    scanf("%f",&cpi);
     if(cpi > 9.0)
     {
         printf("You'll get the Gold Medal!!\n");
         printf("congrats\n");
     }
     else if(cpi > 8.0)
     {
         printf("You'll get the Silver Medal!!\n");

     }
     else if(cpi > 7.0)
     {
         printf("You'll get the Bronze Medal!!\n");
     }
     else
     {
            printf("You'll work hard to get good marks!!\n");

     }
    if(cpi > 8.7)
        if(cpi > 9.0)
            printf("congrats\n");
        else
            printf("better luck next time\n");
        else{
            printf("baadddd\n");
        }

    return 0;
}
