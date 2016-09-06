package edu.adias.smart.sort;

public class SortNumbers {
	
	public static int sort(Integer[] a) {
	    int n = a.length;
	    int numberOfSwaps = 0;
	    for (int i = 1; i < n; i++) {
	        for (int j = i; j > 0; j--) {
	            if (a[j-1]>a[j]){
	                exch(a, j, j-1);
	                numberOfSwaps++;
	            }else break;
	        }
	    }
	    return numberOfSwaps;
	}
	
    private static void exch(Comparable<Integer>[] a, int i, int j) {
        Comparable<Integer> swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
