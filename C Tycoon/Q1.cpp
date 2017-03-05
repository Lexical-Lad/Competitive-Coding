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
			if(arr[2]>A[arr[0]])
			{

				arr[2]=arr[2]-A[arr[0]] -1;
				if(arr[2]==0)
				{
					arr[1]++;
					arr[2]=pq[1];
				}

			}

			else if(arr[2]==A[arr[0]])
			{
				arr[1]++;
				arr[2]=pq[1];
			}


			else
			{
				A[arr[0]]-=arr[2];
				arr[1]++;


				arr[1]+=A[arr[0]]/pq[1];

				arr[3]=A[arr[0]]%pq[1];

				if((arr[3]+1)==pq[1])
				{
					arr[1]++;
					arr[2]=pq[1];

				}
				else
				{
					arr[2]-=(arr[3]-1);
				}

			}

		}
		printf("%d\n",arr[1]);
	}


}





