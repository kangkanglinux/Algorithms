package capter1;
import java.util.Arrays;

public class BinarySearchRecursive {
	
	public static int rank(int key, int[] a, int lo, int hi) {
		if(lo > hi)           return -1;
		int mid = lo + (hi - lo) / 2;
		if(key < a[mid])      return rank(key, a, lo, mid - 1);
		else if(key > a[mid]) return rank(key, a, mid + 1, hi);
		return                mid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 7, 6,3 ,9};
		Arrays.sort(a);
		System.out.println(rank(7, a, 0, a.length - 1));
	}
}
