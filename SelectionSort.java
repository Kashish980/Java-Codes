// Java program for implementation of Selection Sort 
class SelectionSortExample
{ 
	void sort(int arr[]) 
	{ 
		int n = arr.length; 

		// One by one move boundary of unsorted subarray
		
		for (int i = 0; i < n-1; i++) //i<n-1 because we have to run the loop till last index of array that is length-1 of the array
		{ 
			// Find the minimum element in unsorted array 
			int min_id = i; 
			for (int j = i+1; j < n; j++) //i+1 because we have to comare with left over indexes and writing j=i is like comparing 4 with 4 and finding the greater
				if (arr[j] < arr[min_id]) 
					min_id = j; 

			// Swap the found minimum element with the first 
			// element 
			int temp = arr[min_id]; 
			arr[min_id] = arr[i]; 
			arr[i] = temp; 
		} 
	} 

	// Prints the array 
	void printsortedArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver code to test above 
	public static void main(String args[]) 
	{ 
		SelectionSortExample obj = new SelectionSortExample(); 
		int arr[] = {4,25,2,12,11}; 
		obj.sort(arr); 
		System.out.println("Sorted array"); 
		obj.printsortedArray(arr); 
	} 
} 
