package jsd.g5ab2.greatlearning.ds.week5;
import java.util.Scanner;

import jsd.g5ab2.greatlearning.ds.week5.*;
/**
 * @author jagdevsingh
 *
 */
public class InsertionSortVerThree{

    /**
     * 
     */
    public static void performInsertionSort(int arr[]) {
	// TODO Auto-generated constructor stub
	int iter=0, size = arr.length;
	for (int j = 1; j < size; j++) {
	    int temp = arr[j];
	    int i = j - 1;
	    while (i >=0 && arr[i] > temp) {
		arr[i + 1] = arr[i];
		i--;
		iter++;
	    }
	    arr[i + 1] = temp;
	}
	System.out.println("Number of Iterations = "+iter);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int i,element;
	Scanner size=new Scanner(System.in);
	//Scanner input=new Scanner(System.in);
	System.out.println("Enter the Number of Element (Size) for an Array:");
	int arr[]=new int[size.nextInt()];
	for(i=0;i<arr.length;i++) {
	    System.out.println("Enter Element No."+ (i+1));
	    element=size.nextInt();
	    arr[i]=element;
	}size.close();
	//int arr[] = { 100, 2, 4, 1, 56, 23, 9 };
	System.out.println("Array Before Insertion Sort");
	for (int j = 0; j < arr.length; j++) {
	    System.out.print(arr[j] + " ");

	}
	System.out.println();
	performInsertionSort(arr);
	System.out.println("Array after Insertion Sort");
	for (i = 0; i < arr.length; i++) {
	    System.out.print(arr[i] + " ");
	}
    }
}