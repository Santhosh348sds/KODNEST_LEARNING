package com.kodnest.project.CheckCode;

public class KodnestSearchSort {
	//Linear Search
	int linearSearch(int arr[],int key)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
			 return i;
			}
		}
	     return -1;
	}
	
	//Binary Search
	int binarySearch(int arr[],int key)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid]) 
			{
				return mid;
			}
			else if(key<arr[mid])
			{
				low=mid+1;
				return low;
			}
			else if(key>mid)
			{
				high=mid-1;
				return high;
			}
		}
		return -1;
	}
	
	//Bubble Sort Ascending Order
	void bubbleSortAscending(int arr[])
	{
		 for(int i=0;i<=arr.length-1;i++)
		    {
		    	for(int j=0;j<=arr.length-2-i;j++)
		    	{
		    		int temp=0;
					if(arr[j] > arr[j+1])
					{
						temp=arr[j+1];
						arr[j+1]=arr[j];
						arr[j]=temp;
					}
		    	}	 
		 	   
		    }
		 for(int i=0;i<=arr.length-1;i++)
	 	    {
		    	System.out.print(arr[i]+" ");
	 	    }
		 System.out.println();
	}
	
	//Bubble Sort Descending Order
    void bubbleSortDescending(int arr[])
	{
    	 for(int i=0;i<=arr.length-1;i++)
 	    {
 	    	for(int j=0;j<=arr.length-2-i;j++)
 	    	{
 	    		int temp=0;
 				if(arr[j] < arr[j+1])
 				{
 					temp=arr[j+1];
 					arr[j+1]=arr[j];
 					arr[j]=temp;
 				}
 	    	}	 
 	 	   
 	    }
    	 for(int i=0;i<=arr.length-1;i++)
  	    {
 	    	System.out.print(arr[i]+" ");
  	    }
    	 System.out.println();
	}
    
    //Selection Sort Ascending Order
	void selectionSortAscending(int arr[])
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			int min=arr[i];
			int pos=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]<min)
				{
					min = arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		for(int i=0;i<=arr.length-1;i++)
 	    {
	    	System.out.print(arr[i]+" ");
 	    }
		System.out.println();
	}
	
	//Selection Sort Descending Order
	void selectionSortDescending(int arr[])
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			int min=arr[i];
			int pos=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]>min)
				{
					min = arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		System.out.println("Array elements are:");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	//Insertion Sort Ascending Order
	void insertionSortAscending(int arr[])
	{
		int item;
		for(int i=0;i<=arr.length-1;i++)
		{
			item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		System.out.println("Array elements are:");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	//Insertion Sort Descending Order
	void insertionSortDescending(int arr[])
	{
		 int item;
			for(int i=0;i<=arr.length-1;i++)
			{
				item=arr[i];
				int j=i-1;
				while(j>=0 && arr[j]<item)
				{
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=item;
			}
			System.out.println("Array elements are:");
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
	}
	
	//Find Minimum
	int findMinimum(int arr[])
	{
		int n=arr[0];
	     int min=0;
	     for(int i=0;i<arr.length-1;i++)
	     {
	    	 
	    	 if(n<arr[i+1])
	    	 {
	    		 min=n;
	    	 }
	    	 else
	    	 {
	    		min=arr[i+1]; 
	    	 }
	    	 n=min;
	     }
	     
	     return min;	
	     }
	
	//Find Maximum
	int findMaximum(int arr[])
	{
		int n=arr[0];
	     int max=0;
	     for(int i=0;i<arr.length-1;i++)
	     {
	    	
	    	 if(n>arr[i+1])
	    	 {
	    		 max=n;
	    	 }
	    	 else
	    	 {
	    		max=arr[i+1]; 
	    	 }
	    	 n=max;
	     }
	       return max;
	}

}
