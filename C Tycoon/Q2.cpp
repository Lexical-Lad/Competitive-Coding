#include <stdio.h>

int main()

{
	int arr[10];

	scanf("%d",&arr[0]);

	while(arr[0]-->0)
	{
		arr[5]=0;
		scanf("%d",&arr[1]);

		arr[3]=arr[1]/4;
		arr[5]=1;

		for(arr[2]=1;arr[2]<=arr[3];arr[2]++)
		{
			arr[4]=arr[1]- (4*arr[2]);

			if(arr[4]==0)
			{
				arr[5]++;
				continue;
			}

			arr[7]=arr[4]+arr[2];
			for(arr[8]=arr[7]-1;arr[8]>arr[4];arr[8]--)
			arr[7]*=arr[8];

			for(arr[8]=arr[2];arr[8]>=1;arr[8]--)
			{
				arr[7]/=arr[8];
			}

			arr[5]+=arr[7];

		}

		printf("%d\n",arr[5]);

	}
	return 0;
}


