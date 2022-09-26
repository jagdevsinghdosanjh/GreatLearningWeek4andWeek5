package jsd.g5ab2.greatlearning.ds.week5;

import java.util.Scanner;

public class InsertionSortVerFour {

    // your code here...
    public int i,size_of_array;
    public int arr[];
    public boolean status;
    
    Scanner sc=new Scanner(System.in);
    private int sortedvalue;

    public void implementationOfInsertionSort() {
	System.out.println("Enter the Number of Elements for Array to Sort:");
	size_of_array=sc.nextInt();
	arr=new int[size_of_array];
	System.out.println("Enter the Elements in Array:");

	insertValues();

	status = checkForStatus();

	do {
	    sortValues();
	    printValues();
	    sortedvalue += 1;
	    status = checkForStatus();
	} while (status == false);

    }

    public void insertValues() {
	for(i=0;i<size_of_array;i++) {
	    System.out.println("Enter Element at Position="+i+"--->");
	    arr[i]=sc.nextInt();
	}
    }

    public void sortValues() {

	// your code here...
	int size = arr.length;
	for (int j = 1; j < size; j++) {
	    int temp = arr[j];
	    int i = j - 1;
	    while (i >=0 && arr[i] > temp) {
		arr[i + 1] = arr[i];
		i--;
	    }
	    arr[i + 1] = temp;
	}

    }

    public void printValues() {
	// your code here...
	int i;
	System.out.println("Value stored in Array are:");
	for (i = 0; i <arr.length; i++) {
	    System.out.print(arr[i]+", ");
	}
    }

    public boolean checkForStatus() {
	for(i=0;i<size_of_array-1;i++) {
	    if(arr[i]>arr[i+1]) {
		sortedvalue=i+1;
		return false;
	    }
	}
	return true;
    }

    public static void main(String[] args) {
	
	// your code here...
	InsertionSortVerFour inssort=new InsertionSortVerFour();
	inssort.implementationOfInsertionSort();
    }

}