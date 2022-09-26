package jsd.g5ab2.greatlearning.ds.week4;

import java.util.Scanner;

/**
 * @author jagdevsingh
 *
 */
public class BubbleSort {
	public int array[];
	public int NUM_ELEMENTS, temp, len, i, j;
	public boolean status = true;
	Scanner sc = new Scanner(System.in);

	public void implmentationOfBubbleSort() {
		System.out.println("Enter the number of elements to sort");
		NUM_ELEMENTS = sc.nextInt();
		array = new int[NUM_ELEMENTS];
		System.out.println("Enter the elements now.");
		// Insert values
		insertValues();
		// Sort values();
		do {
			sortValues();
			status = checkForStatus();
		} while (status == false);
	}

	public void insertValues() {
		for (int i = 0; i < NUM_ELEMENTS; i++) {
			System.out.print("Enter element at position " + i + ": ");
			array[i] = sc.nextInt();
		}
	}

	public boolean checkForStatus() {
		for (i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public void sortValues() {
		len = array.length - 1;
		for (int i = 0; i < len; i++) {
			j = i + 1;
			if (array[i] > array[j]) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				printValues();
			}
		}
		len -= 1;
	}

	public void printValues() {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Value at position " + i + " is:" + array[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		BubbleSort bubblesort = new BubbleSort();
		bubblesort.implmentationOfBubbleSort();
	}
}