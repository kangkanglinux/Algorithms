package capter1;

import java.util.Arrays;

public class BinarySearch {
	
	public static int rank(int key, int[] a){
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi) {
			int mid = (hi - lo) / 2;
			if(key < a[mid])      hi = mid - 1;
			else if(key > a[mid]) lo = mid + 1;
			else 				  return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		Arrays.sort(a);
		int index = rank(4, a);
		System.out.println(index);
	}

}
