package test;

import java.util.Arrays;

public class Solution {

		public static int[] sortedSquares(int[] A) {
			return A;
			// write code here
			
		}

		public static void main(String[] args) {
			verifyOutput(sortedSquares(new int[] { -4, -1, 0, 3, 10 }), new int[] { 0, 1, 9, 16, 100 });
			verifyOutput(sortedSquares(new int[] { -7, -3, 2, 3, 11 }), new int[] { 4, 9, 9, 49, 121 });
			verifyOutput(sortedSquares(new int[] { -4, -3, -2, -1, 0 }), new int[] { 0, 1, 4, 9, 16 });
			verifyOutput(sortedSquares(new int[] { 0, 1, 2, 3, 4 }), new int[] { 0, 1, 4, 9, 16 });
		}

		public static void verifyOutput(int[] input, int[] output) {
			if (Arrays.equals(input, output)) {
				System.out.println("Test case passed!");
			} else {
				System.out.print("Test case failed, input (");
				for (int i:input) {
					System.out.print(i + " ");
				}
				System.out.print(") did not match output (");
				for (int i:input) {
					System.out.print(i + " ");
				}
				System.out.print(")");
				System.out.println();
			}
		}
	}

