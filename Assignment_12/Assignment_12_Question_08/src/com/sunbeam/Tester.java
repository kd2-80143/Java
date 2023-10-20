package com.sunbeam;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Tester {

	public static void main(String[] args) {
		IntStream strm1 = IntStream.range(1, 10);
		int a = strm1.sum();
		System.out.println(a);
		
		IntStream strm2 = IntStream.range(1, 10);
		IntSummaryStatistics b = strm2.summaryStatistics();
		System.out.println(b);
		

	}

}
