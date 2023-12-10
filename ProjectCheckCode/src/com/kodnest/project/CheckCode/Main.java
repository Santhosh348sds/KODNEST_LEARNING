package com.kodnest.project.CheckCode;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("Enter an array length");
	     int arr[]=new int[scan.nextInt()];
	     System.out.println("Enter "+arr.length+" element");
	     for(int i=0;i<=arr.length-1;i++)
	     {
	    	 arr[i]=scan.nextInt();
	     }
	     System.out.println("Array Elements are"+ ".....");
	     for(int i=0;i<=arr.length-1;i++)
	     {
	        System.out.print(arr[i]+" ");
	     }
	     System.out.println();
	     KodnestSearchSort kss=new KodnestSearchSort();
	     while(true)
	     {
	    	 System.out.println("Enter your choice:");
	    	 System.out.println("Press1 -------> Searching");
	    	 System.out.println("Press2 -------> Sorting");
	    	 System.out.println("Press3 -------> Find Minimum or Maximum");
	    	 System.out.println("Press other for -----> Exit");
	    	 int choice = scan.nextInt();
	    	 switch(choice)
	    	 {
	    	 case 1:
	    		 System.out.println("Press1 -----> Linear Search");
		    	 System.out.println("Press2 -----> Binary Search");
		    	 int choice1=scan.nextInt();
		    	 if(choice1==1)
		    	 {
		    		 System.out.println("Enter key to Search:");
		    		 int key=scan.nextInt();
		    		 int res=kss.linearSearch(arr,key);
		    		 if(key>=0)
		    		 {
		    			 System.out.println("key found at "+res);
		    		 }
		    		 else
		    		 {
		    			 System.out.println("key not found");
		    		 }
		    	 }
		    	 else if(choice1==2)
		    	 {
		    		 System.out.println("Before search you want to sort array ?  if yes ---> press1 //  if no ---> press2");
		    		 int num=scan.nextInt();
		    		 if(num==1)
		    		 {
		    			 System.out.println("press1 ---> BubbleSort  //  Press2 ---> SelectionSort  //  Press3 ---> InsertionSort");
		    			 int num2=scan.nextInt();
		    			 if(num2==1)
		    			 {
		    				 System.out.println("Press1 ----> Array Ascending Sort");
			    			 System.out.println("Press2 ----> Array Descending Sort");
			    			 int num3=scan.nextInt();
			    			 if(num3==1)
			    			 {
			    			 kss.bubbleSortAscending(arr);
			    			
			    			 }
			    			 else if(num3==2)
			    			 {
			    				 kss.bubbleSortDescending(arr);
			    			 }
			    			 else
			    			 {
					    		 System.out.println("Entered choice is incorrect!!! Please Re Enter your choice");
			    			 }
		    			 }
		    			 else if(num2==2)
		    			 {
		    				 System.out.println("Press1 ----> Array Ascending Sort");
			    			 System.out.println("Press2 ----> Array Descending Sort");
			    			 int num4=scan.nextInt();
			    			 if(num4==1)
			    			 {
			    			 kss.selectionSortAscending(arr);
			    			 System.out.println("Array elements are.........");
				    		 for(int i=0;i<=arr.length-1;i++)
				    		 {
				    			 System.out.println(arr[i]+" ");
				    		 }
			    			 }
			    			 else if(num4==2)
			    			 {
			    				 kss.selectionSortDescending(arr);
			    				 System.out.println("Array elements are.........");
					    		 for(int i=0;i<=arr.length-1;i++)
					    		 {
					    			 System.out.println(arr[i]+" ");
					    		 }
			    			 }
			    			 else
			    			 {
					    		 System.out.println("Entered choice is incorrect!!! Please Re Enter your choice");
			    			 }
			    			 
		    			 }
		    			 else if(num2==3)
		    			 {
		    				 System.out.println("Press1 ----> Array Ascending Sort");
			    			 System.out.println("Press2 ----> Array Descending Sort");
			    			 int num5=scan.nextInt();
			    			 if(num5==1)
			    			 {
			    			 kss.insertionSortAscending(arr);
			    			 }
			    			 else if(num5==2)
			    			 {
			    				 kss.insertionSortDescending(arr);
			    			 }
			    			 else
			    			 {
					    		 System.out.println("Entered choice is incorrect!!! Please Re Enter your choice");
			    			 }
		    			 }
		    			 else
		    			 {
		    				 System.out.println("Entered number is in correct.....");
		    			 }
		    			 System.out.println("");
				    		
			    		 System.out.println("Enter key to Search:");
			    		 int key=scan.nextInt();
			    		 int res=kss.binarySearch(arr,key);
			    		 if(key>=0)
			    		 {
			    			 System.out.println("key found at "+res);
			    		 }
			    		 else
			    		 {
			    			 System.out.println("key not found");
			    		 }
		    			
		    		 }
		    		 else if(num==2)
		    		 {
		    		 System.out.println("");
		    		
		    		 System.out.println("Enter key to Search:");
		    		 int key=scan.nextInt();
		    		 int res=kss.binarySearch(arr,key);
		    		 if(key>=0)
		    		 {
		    			 System.out.println("key found at "+res);
		    		 }
		    		 else
		    		 {
		    			 System.out.println("key not found");
		    		 }
		    	}
		    	 }
		    	 else
		    	 {
		    		 System.out.println("Entered choice is incorrect!!! Please Re Enter your choice");
		    	 }
                       break;
	    	 case 2:
	    		 System.out.println("Press1 ----> BubbleSort");
	    		 System.out.println("Press2 ----> SelectionSort");
	    		 System.out.println("Press3 ----> InsertionSort");
	    		 int choice2=scan.nextInt();
	    		 if(choice2==1)
	    		 {
	    			 System.out.println("Press1 ----> Array Ascending Sort");
	    			 System.out.println("Press2 ----> Array Descending Sort");
	    			 int n=scan.nextInt();
	    			 if(n==1)
	    			 {
	    			 kss.bubbleSortAscending(arr);
	    			 }
	    			 else if(n==2)
	    			 {
	    				 kss.bubbleSortDescending(arr);
	    			 }
	    			 else
	    			 {
			    		 System.out.println("Entered choice is incorrect!!! Please Re Enter your choice");
	    			 }
	    		 }
	    		 else if(choice2==2)
	    		 {
	    			 System.out.println("Press1 ----> Array Ascending Sort");
	    			 System.out.println("Press2 ----> Array Descending Sort");
	    			 int n=scan.nextInt();
	    			 if(n==1)
	    			 {
	    			 kss.selectionSortAscending(arr);
	    			 }
	    			 else if(n==2)
	    			 {
	    				 kss.selectionSortDescending(arr);
	    			 }
	    			 else
	    			 {
			    		 System.out.println("Entered choice is incorrect!!! Please Re Enter your choice");
	    			 }
	    		 }
	    		 else if(choice2==3)
	    		 {
	    			 System.out.println("Press1 ----> Array Ascending Sort");
	    			 System.out.println("Press2 ----> Array Descending Sort");
	    			 int n=scan.nextInt();
	    			 if(n==1)
	    			 {
	    			 kss.insertionSortAscending(arr);
	    			 }
	    			 else if(n==2)
	    			 {
	    				 kss.insertionSortDescending(arr);
	    			 }
	    			 else
	    			 {
			    		 System.out.println("Entered choice is incorrect!!! Please Re Enter your choice");
	    			 }
	    		 }
	    		 else
	    		 {
		    		 System.out.println("Entered choice is incorrect!!! Please Re Enter your choice");
	    		 }
	    		 break;

	    	 case 3:
	    		 System.out.println("Press1 ----> Find Minimum");
	    		 System.out.println("Press2 ----> Find Maximum");
	    		 int choice3=scan.nextInt();
	    		 if(choice3==1)
	    		 {
	    			 System.out.println("Before search you want to sort array ?  if yes ---> press1 //  if no ---> press2");
		    		 int num=scan.nextInt();
		    		 if(num==1)
		    		 {
		    			 System.out.println("press1 ---> BubbleSort  //  Press2 ---> SelectionSort  //  Press3 ---> InsertionSort");
		    			 int num2=scan.nextInt();
		    			 if(num2==1)
		    			 {
		    				 System.out.println("Press1 ----> Array Ascending Sort");
			    			 System.out.println("Press2 ----> Array Descending Sort");
			    			 int num3=scan.nextInt();
			    			 if(num3==1)
			    			 {
			    			 kss.bubbleSortAscending(arr);
			    			 }
			    			 else if(num3==2)
			    			 {
			    				 kss.bubbleSortDescending(arr);
			    			 }
			    			 else
			    			 {
					    		 System.out.println("Entered choice is incorrect!!! Please Re Enter your choice");
			    			 }
		    			 }
		    			 else if(num2==2)
		    			 {
		    				 System.out.println("Press1 ----> Array Ascending Sort");
			    			 System.out.println("Press2 ----> Array Descending Sort");
			    			 int num4=scan.nextInt();
			    			 if(num4==1)
			    			 {
			    			 kss.selectionSortAscending(arr);
			    			 }
			    			 else if(num4==2)
			    			 {
			    				 kss.selectionSortDescending(arr);
			    			 }
			    			 else
			    			 {
					    		 System.out.println("Entered choice is incorrect!!! Please Re Enter your choice");
			    			 }
			    			 
		    			 }
		    			 else if(num2==3)
		    			 {
		    				 System.out.println("Press1 ----> Array Ascending Sort");
			    			 System.out.println("Press2 ----> Array Descending Sort");
			    			 int num5=scan.nextInt();
			    			 if(num5==1)
			    			 {
			    			 kss.insertionSortAscending(arr);
			    			 }
			    			 else if(num5==2)
			    			 {
			    				 kss.insertionSortDescending(arr);
			    			 }
			    			 else
			    			 {
					    		 System.out.println("Entered choice is incorrect!!! Please Re Enter your choice");
			    			 }
		    			 }
		    			 else
		    			 {
		    				 System.out.println("Entered number is in correct.....");
		    			 }
		    		 }
	    			int res = kss.findMinimum(arr);
	    			System.out.println("Minimum number is: "+res);
	    		 }
	    		 else if(choice3==2)
	    		 {
	    			 System.out.println("Before search you want to sort array ?  if yes ---> press1 //  if no ---> press2");
		    		 int num=scan.nextInt();
		    		 if(num==1)
		    		 {
		    			 System.out.println("press1 ---> BubbleSort  //  Press2 ---> SelectionSort  //  Press3 ---> InsertionSort");
		    			 int num2=scan.nextInt();
		    			 if(num2==1)
		    			 {
		    				 System.out.println("Press1 ----> Array Ascending Sort");
			    			 System.out.println("Press2 ----> Array Descending Sort");
			    			 int num3=scan.nextInt();
			    			 if(num3==1)
			    			 {
			    			 kss.bubbleSortAscending(arr);
			    			 }
			    			 else if(num3==2)
			    			 {
			    				 kss.bubbleSortDescending(arr);
			    			 }
			    			 else
			    			 {
					    		 System.out.println("Entered choice is incorrect!!! Please Re Enter your choice");
			    			 }
		    			 }
		    			 else if(num2==2)
		    			 {
		    				 System.out.println("Press1 ----> Array Ascending Sort");
			    			 System.out.println("Press2 ----> Array Descending Sort");
			    			 int num4=scan.nextInt();
			    			 if(num4==1)
			    			 {
			    			 kss.selectionSortAscending(arr);
			    			 }
			    			 else if(num4==2)
			    			 {
			    				 kss.selectionSortDescending(arr);
			    			 }
			    			 else
			    			 {
					    		 System.out.println("Entered choice is incorrect!!! Please Re Enter your choice");
			    			 }
			    			 
		    			 }
		    			 else if(num2==3)
		    			 {
		    				 System.out.println("Press1 ----> Array Ascending Sort");
			    			 System.out.println("Press2 ----> Array Descending Sort");
			    			 int num5=scan.nextInt();
			    			 if(num5==1)
			    			 {
			    			 kss.insertionSortAscending(arr);
			    			 }
			    			 else if(num5==2)
			    			 {
			    				 kss.insertionSortDescending(arr);
			    			 }
			    			 else
			    			 {
					    		 System.out.println("Entered choice is incorrect!!! Please Re Enter your choice");
			    			 }
		    			 }
		    			 else
		    			 {
		    				 System.out.println("Entered number is in correct.....");
		    			 }
		    		 }
	    			 
	    			int res = kss.findMaximum(arr);
	    			System.out.println("Maximum number is: "+res);
	    		 }
	    		 else
	    		 {
		    		 System.out.println("Entered choice is incorrect!!! Please Re Enter your choice");
	    		 }
	    		 break;
	         default:
	        	 System.exit(0);
	        	 return;
	    	 }
	    	 
	     }
	     
	}

}
