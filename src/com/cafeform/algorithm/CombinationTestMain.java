package com.cafeform.algorithm;

import java.util.Arrays;
import java.util.List;

/**
 * Combination
 */
public class CombinationTestMain
{
	public static void main(String args[]){
		new CombinationTestMain().start();
	}

	private void start()
	{
		int num = 2;
		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
		List<List<String>> result;

		Combination combination = new Combination(list, num);
		result = combination.getResult();

		System.out.println("Count: " + result.size());
		System.out.println(result);
	}
}
