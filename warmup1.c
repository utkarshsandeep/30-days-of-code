#include <stdio.h>
#include <math.h>
int main(void) {
	int x;
	scanf("%d",&x);
	int i,j,k=0,l;
	int z[x];
	for(i=0;i<x;i++)
	{
	    scanf("%d",&z[i]);
	}
	int w[10][10];
	for(i=0;i<x;i++)
	{
		for(j=0;j<x-1;j++)
		{
			if(z[j]>z[j+1])
			{
				int t=z[j];
				z[j]=z[j+1];
				z[j+1]=t;
			}
		}
	}
	for(i=0;i<x;)
	{
		for(j=i+1;j<x-1;j++)
		{
			if(z[i]==z[j])
			{
				w[k][0]=z[i];
				w[k++][1]=z[j];
				l=j;
				break;
			}
		}
		i=l+1;
	}
	for(i=0;i<x;i++)
	{
		printf("%d ",z[i]);
	}
	for(i=0;i<k;i++)
	{
	printf("%d %d\n",w[i][0],w[i][1]);
}
}
