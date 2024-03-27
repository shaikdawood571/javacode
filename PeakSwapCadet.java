package com.kn.peakSwap;
import java.util.*;
public class PeakSwapCadet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array = ");
		int[] arr = new int[scan.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter the array "+(i+1)+" element = ");
			arr[i] = scan.nextInt();
		}
		
		boolean swapped = swap(arr);
		if (swapped == true) {
			System.out.print("[");
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j]);
				if (j < arr.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.print("]");
		} else {
			System.out.print("There are no peak adjacent cadents!");
		}
		scan.close();
	}

	public static boolean swap(int[] arr) {
		boolean swapped = false;
		for (int i = 0; i < arr.length - 2; i++) {
			int temp = 0;
			if (arr[i + 1] > arr[i] && arr[i + 1] > arr[i + 2]) {
				temp = arr[0];
				arr[0] = arr[i + 1];
				arr[i + 1] = temp;
				swapped = true;
			}
		}
		return swapped;
	}
}
//Good code!