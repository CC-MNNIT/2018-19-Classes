//@author: Akshay Sharma(akshay31057)
// Program to find the number of pairs in the array having sum x given array has distinct elements and a[i]<100000
#include<stdio.h>
int main()
{
    int n, x, i;
    printf("Enter the value of x: ");
    scanf("%d",&x);
    printf("Enter the number of elements in the array: ");
    scanf("%d",&n);
    printf("Enter the elements of array\n");
    int a[n];

    for(i=0; i<n; i++){
        scanf("%d",&a[i]);
    }

    int hash[100000] = {0};
    for(i=0; i<n; i++){
        hash[a[i]]++;
    }
    int ans = 0;
    for(int i=0; i<n; i++){
        int t = x - a[i];
        if((t>0) && hash[t]){
        ans++;
        }
    }
    ans >>= 1;
    printf("Number of Pairs having sum %d are %d", x, ans);
    return 0;
}
