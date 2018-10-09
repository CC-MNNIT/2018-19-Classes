//@author: Akshay Sharma(akshay31057)
// Program to find the number of set bits in the binary representation of the number
#include<stdio.h>
int main()
{
    int n;
    printf("Enter the number: ");
    scanf("%d", &n);
    int count = 0;
    while(n > 0)
    {
        if(n & 1){
            count++;
        }
        n >>= 1;
    }
    printf("Number of set bits: %d", count);

    return 0;
}
