#include <stdio.h>
#include <math.h>
int main(void) {
	int n,d;
	scanf("%d%d",&n,&d);
	int i,j;
	int a[n];
	for(i=0;i<n;i++)
	{
	    scanf("%d",&a[i]);
	}
	for(i=1;i<=d;i++)
	{
		int t=a[0];
		for(j=0;j<n-1;j++)
		{
			a[j]=a[j+1];
		}
		a[j]=t;
	}
	for(i=0;i<n;i++)
	{
	    printf("%d ",&a[i]);
	}
}
