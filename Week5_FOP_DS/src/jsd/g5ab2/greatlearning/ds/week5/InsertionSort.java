/**
 * 
 */
package jsd.g5ab2.greatlearning.ds.week5;

/**
 * @author jagdevsingh
 *
 */
public class InsertionSort {

    /**
     * 
     */
    public static void performInsertionSort(int arr[]) {
	// TODO Auto-generated constructor stub
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

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr[] = { 100, 2, 4, 1, 56, 23, 9 };
	System.out.println("Array Before Insertion Sort");
	for (int i = 0; i < arr.length; i++) {
	    System.out.println(arr[i] + " ");

	}
	System.out.println();
	performInsertionSort(arr);
	System.out.println("Array after Insertion Sort");
	for (int i = 0; i < arr.length; i++) {
	    System.out.println(arr[i] + " ");
	}

    }

}
