package com.sunbeam;

@FunctionalInterface
interface Check<T> 
{
	boolean compare(T x, T y);
}
public class Tester {
	
	public static <T> int countIf(T[] arr, T key, Check<T> c)
	{
		int cnt = 0;
		for(T ele : arr)
		{
			if(c.compare(ele, key))
				cnt++;
		}
		return cnt;
		
	}
	public static void main(String[] args) {
		Double [] arr = {1.1, 2.2, 1.1, 3.2, 4.2, 2.2};
		Double key = 1.1;
		int cnt = countIf(arr, key, (x,y) -> x.equals(y));
		System.out.println("Count : " + cnt);
		

	}

}
