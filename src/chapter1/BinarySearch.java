package chapter1;

import java.util.Scanner;

public class BinarySearch{
	
	public static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			//System.out.println(mid);
			if     (a[mid] > key) hi = mid - 1;
			else if(a[mid] < key) lo = mid + 1;
			else                  return mid;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		int key = 3;
		System.out.println(rank(key, arr));
	}
}