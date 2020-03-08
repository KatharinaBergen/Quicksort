package Zinssatz;

public class Quicksort_recursive_3_zeroIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quickSort(left, right);
		System.out.println("Result: ");
		for(int num:array) {System.out.println(num);}
		System.out.println("Number of recursions needed: " + numRecursion);
		
	}
	
	public static int[] array = {11,15,4,1,3,5,8,10,9,14,13,2,7,6,12};
	public static int left = 0;
	public static int right = array.length-1;
	public static int numRecursion = 0;
	
	public static void quickSort(int left, int right) {
		
		//variables
		int pivot = array[right];
		int l = left;
		int r = right;
		
		//sort
		if(l < r && array[l] >= pivot && array[r] <= pivot) {
			int temp = array[l];
			array[l] = array[r];
			array[r] = temp;}
		
		//proof of concept
		System.out.println("l: " + l + " r: " + r );
		
		//recursive
		if(left < right) {
			numRecursion++;
			quickSort( left, r-1);
			quickSort( l+1, right);
		}
	}
}
