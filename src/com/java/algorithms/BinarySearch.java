package com.java.algorithms;

public class BinarySearch {

	public static void main(String[] args) {
		int index = binarySearch(new int[] {-1,3,5,8,10,15,16,20},16);
		System.out.println("### INDEX: " + index);
	}

	// [1, 2, 3, 4, 5, 6, 7]
	public static int binarySearch(int[] a, int key) {
		int low = 0;
		int high = a.length - 1;
		
		while(low <= high) {
			int middle = low + (high - low)/2;
			
			if (key < a[middle]) {
				high = middle - 1;
			} else if (key > a[middle]) {
				low = middle + 1;
			} else {
				return middle;
			}
		}
		
		return -1;
	}
	
}