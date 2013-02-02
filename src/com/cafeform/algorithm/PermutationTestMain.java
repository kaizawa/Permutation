package com.cafeform.algorithm;

import java.util.Arrays;
import java.util.List;

/**
 * Test main class for Permutation class
 */
public class PermutationTestMain
{
	public static void main(String args[]){
		new PermutationTestMain().start();
	}

	private void start()
	{
		int num = 3;
		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
		List<List<String>> result;

		Permutation permutation = new Permutation(list, num);
		result = permutation.getResult();

		System.out.println("Count: " + result.size());
		System.out.println(result);
	}
}
