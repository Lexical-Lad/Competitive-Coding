#include <stdio.h>

int main()
{

	int pq[2];
	int A[100];
	int arr[10];
	arr[1]=0;
	arr[2];


	scanf("%d",&arr[5]);

	while(arr[5]-->0)
	{
		arr[1]=0;
		scanf("%d",&pq[0]);
		scanf("%d",&pq[1]);

		for(arr[0]=0;arr[0]<pq[0];arr[0]++)
		scanf("%d",&A[arr[0]]);

		arr[2]=pq[1];

		for(arr[0]=0;arr[0]<pq[0];arr[0]++)
		{
			if(arr[1]%pq[1]!=0)
			arr[1]++;

			arr[1]+=A[arr[0]];


		}

		if(arr[1]%pq[1]!=0)
		printf("%d\n",arr[1]/pq[1] + 1);
		else
		printf("%d\n",arr[1]/pq[1]);

	}

	return 0;

}





