#include <stdio.h>
int main(void) {
	// your code goes here
	int l;
	scanf("%d",&l);
	int i;
	int x[l];
	for(i=0;i<l;i++)
	{
		scanf("%d",&x[i]);
	}
	int count=0;
	for(i=0;i<l-2;)
	{
		if(x[i+2]==0)
		{
			i=i+2;
		}
		else if(x[i+1]==0)
		{
			i++;
		}
		else
		{
			i=i+2;
		}
		count++;
	}
	printf("%d\n",count);
	return 0;
}
