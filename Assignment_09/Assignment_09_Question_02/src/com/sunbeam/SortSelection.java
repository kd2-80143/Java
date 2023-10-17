package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

class CompareSelectionSort implements Comparator<Double>
{

	@Override
	public int compare(Double e1, Double e2) {
		int diff = Double.compare(e1.doubleValue(), e2.doubleValue());
		return diff;
	}
	
}
public class SortSelection{
	
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
	    for(int i=0; i<arr.length-1; i++) {
	        for(int j=i+1; j<arr.length; j++) {
	            if(c.compare(arr[i], arr[j]) > 0) {
	               T temp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = temp;
	            } 
	        }
	    } 
	}

	public static void main(String[] args) {
		Double[] arr = {2.2,5.5,3.3,4.4,1.1};
		System.out.println("Before sort :");
		for(Double e:arr)
		{
			System.out.println(e);
		}
		CompareSelectionSort sel = new CompareSelectionSort();
		selectionSort(arr,sel);
		System.out.println("After sort :");
		for(Double e:arr)
		{
			System.out.println(e);
		}
		

	}



}
