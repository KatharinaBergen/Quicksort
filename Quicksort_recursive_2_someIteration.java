package Zinssatz;

public class Quicksort_recursive_2_someIteration {

	public static void main(String[] args) {
		int[] array = {11,15,4,1,3,5,8,10,9,14,13,2,7,6,12};
		int right = array.length-1;
		quickSort(array, left, right);
		
		for(int num:array) {System.out.println(num);}
		System.out.println("Number of recursions needed: " + numRecursion);
		System.out.println("Number of iterations needed: " + numIterations);
	}
	
	public static int left = 0;
	public static int numRecursion = 0;
	public static int numIterations = 0;
	
	public static void quickSort(int[] array, int left, int right) {
		
		//variables
		int pivot = array[right];
		int l = left;
		int r = right;
		
		//sort
		while(l < r) {
			while(array[l] < pivot && l < right) {l++;}
			while(array[r] > pivot && r > left) {r--;}
			
			if(l < r && array[l] >= pivot && array[r] <= pivot) {
				int temp = array[l];
				array[l] = array[r];
				array[r] = temp;}
			
			numIterations++;
		}
		
		//recursive
		if(left < right) {
			numRecursion++;
			quickSort(array, left, l-1);	
			quickSort(array, l+1, right);			
		}

	}

}
