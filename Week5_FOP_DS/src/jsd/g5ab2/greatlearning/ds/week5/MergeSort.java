package jsd.g5ab2.greatlearning.ds.week5;

import java.util.Scanner;

public class MergeSort {
    public int i, size_of_array;
    public int arr[];
    public boolean status;
    Scanner sc = new Scanner(System.in);
    private int sortedvalue;

    public void implementationOfMergeSort() {
	System.out.println("Enter the Number of Elements for Array to Sort:");
	size_of_array = sc.nextInt();
	arr = new int[size_of_array];
	System.out.println("Enter the Elements in Array:");
	insertValues();
	status = checkForStatus();
	do {
	    mergeSort(arr,i,i);
	    printValues();
	    sortedvalue += 1;
	    status = checkForStatus();
	} while (status == false);
    }

    public void insertValues() {
	for (i = 0; i < size_of_array; i++) {
	    System.out.println("Enter Element at Position=" + i + "--->");	
	    arr[i] = sc.nextInt();
	}
    }
    static void mergeSort(int a[], int i, int j) 
    {
	int mid = (j + i) / 2;
	if (j > i) 
	{
	    // recursively splitting the array into two halves
	    mergeSort(a, i, mid); // first half
	    mergeSort(a, mid + 1, j); // second half
	    // merging the two halves to
	    // form a bigger array
	    merger(a, i, mid, mid + 1, j);
	}
    }
	static void merger(int arr[], int s1, int e1, int s2, int e2) {
	// calculating the temp array
	int length = e2 - s1 + 1;
	// the temp array
	int temp[] = new int[length];
	// two pointers pointes to the starting
	// index of the two sorted arrays
	int ptr1 = s1, ptr2 = s2;
	// index is the variable used to
	// iterate over the temp array
	int index = 0;
	// while loop does the actual merging and
	// stores the resultant sorted array in temp
	while (ptr1 <= e1 && ptr2 <= e2) {
	    if (ptr1 <= e1 && (arr[ptr1] < arr[ptr2])) {
		temp[index] = arr[ptr1];
		ptr1 = ptr1 + 1;
	    } else if (ptr2 <= e2) {
		temp[index] = arr[ptr2];
		ptr2 = ptr2 + 1;
	    }
	    index = index + 1;
	}
	// copying remaining elements of the arr to temp
	while (ptr1 <= e1) {
	    temp[index] = arr[ptr1];
	    ptr1 = ptr1 + 1;
	    index = index + 1;
	}
	// copying remaining elements of the arr to temp
	while (ptr2 <= e2) {
	    temp[index] = arr[ptr2];
	    ptr2 = ptr2 + 1;
	    index = index + 1;
	}
	// resetting the index to 0
	index = 0;
	// copying the values of temp array
	// in the array arr
	for (int i = s1; i <= e2; i++) {
	    arr[i] = temp[index];
	    index = index + 1;
	}
    }

    public void printValues() {
	// your code here...
	int i;
	System.out.println("Value stored in Array are:");
	for (i = 0; i < arr.length; i++) {
	    System.out.println(arr[i] + ", ");
	}
    }

    public boolean checkForStatus() {
	for (i = 0; i < size_of_array - 1; i++) {
	    if (arr[i] > arr[i + 1]) {
		sortedvalue = i + 1;
		return false;
	    }
	}
	return true;
    }

    public static void main(String[] args) {
	// your code here...
	MergeSort mergesort = new MergeSort();
	mergesort.implementationOfMergeSort();
    }
}
