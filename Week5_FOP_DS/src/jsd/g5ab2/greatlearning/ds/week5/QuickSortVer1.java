package jsd.g5ab2.greatlearning.ds.week5;

import java.util.Scanner;
public class QuickSortVer1 {
public int temp, i, j, l, r,NUM_ELEMENTS;
public static int PIVOT;
public int array[];// = { 22, 0, 4, 0, 11, 1, -2 };
Scanner sc = new Scanner(System.in);
public void imlpementationOfQuickSort() {
    System.out.println("Enter the number of elements you want to sort:");
	NUM_ELEMENTS = sc.nextInt();
	array = new int[NUM_ELEMENTS];
	System.out.println("Enter the elements now.");
	insertValues();
l = 0;
r = array.length - 1;
printValues();
divideArray(array, l, r);
}
public void insertValues() {
	for (i = 0; i < array.length; i++) {
	    int pos=i+1;
	    System.out.print("Enter element at position " + pos + ": ");
	    array[i] = sc.nextInt();
	}
}

public void divideArray(int array[], int l, int r) {
if (l < r) {
int pi = partition(array, l, r);
divideArray(array, l, pi - 1);
divideArray(array, pi + 1, r);
}
}
public int partition(int array[], int l, int r) {
PIVOT = l;
i = l;
j = r;
while ((checkBelowPivot() == false) || (checkAbovePivot() == false)) {
System.out.println("i, j: " + i + ", " + j);
checkFromRight();
checkFromLeft();
} return PIVOT;
}
public boolean checkBelowPivot() {
for (int k = 0; k <= PIVOT; k++) {
if (array[k] > array[PIVOT]) {
return false;
}
} return true;
}
public boolean checkAbovePivot() {
if (PIVOT < array.length - 1) {
for (int k = PIVOT + 1; k < array.length - 1; k++) {
if (array[k] < array[PIVOT]) {
return false;
}
}
} return true;
}
public void checkFromRight() {
for (int k = j; k > PIVOT; k--) {
if (array[k] < array[PIVOT]) {
swapValues(i, k);
printValues();
PIVOT = j = k;
checkFromLeft();
}
}
}
public void checkFromLeft() {
for (int k = i; k < PIVOT; k++) {
if (array[k] > array[PIVOT]) {
swapValues(k, j);
printValues();
PIVOT = i = k;
checkFromRight();
}
}
}
public void swapValues(int i, int j) {
temp = array[i];
array[i] = array[j];
array[j] = temp;
}
public void printValues() {
for (int i = 0; i < array.length; i++) {
    int x=i+1;
System.out.println("Value at position " + x + " is:" + array[i]);
}
System.out.println();
}
public static void main(String[] args) {
QuickSortVer1 quicksort = new QuickSortVer1();
quicksort.imlpementationOfQuickSort();
}
}