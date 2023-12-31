package arrayJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Practice {

	public static boolean practice1(int numbers[]) {
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static int findkey(int nums[],int target) {
		for (int i = 0; i < nums.length; i++) {
				if (nums[i] == target) {
					return i;
				}
		}
		return -1;
	}
	
	
	public static int findMaxProfit(int prices[]) {
		int buyPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for (int i = 0; i < prices.length; i++) {
			if (buyPrice < prices[i]) {
				int profit = prices[i] - buyPrice;
				maxProfit = Math.max(maxProfit, profit);
			} else {
				buyPrice = prices[i];
			}
		}
		return maxProfit;
	}
	
	
	public static int findtrappingWater(int height[]) {
		int n= height.length;
		int leftMax[] = new int[height.length];
		leftMax[0] = height[0];
		
		for (int i = 1; i < n; i++) {
			leftMax[i] = Math.max(height[i], leftMax[i-1]);
		}
		
		int rightMax[] = new int[n];
		rightMax[n-1] = height[n-1];
		
		for (int i = n-2; i >= 0; i--) {
			rightMax[i] = Math.max(height[i], rightMax[i+1]);
		}
		
		int trappingWater = 0;
		
		for (int i = 0; i < n; i++) {
			int waterLevel = Math.min(leftMax[i], rightMax[i]);
			trappingWater = trappingWater + waterLevel -height[i];
		}
		return trappingWater;
	}
	
	public static List<List<Integer>> TripletSumEqualZero(int nums[]) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					if ((nums[i] + nums[j] + nums[k] == 0)) {
						List<Integer> triplet = new ArrayList<Integer>();
						triplet.add(nums[i]);
						triplet.add(nums[j]);
						triplet.add(nums[k]);
						Collections.sort(triplet);
						result.add(triplet);
					}
				}
			}
		}
		result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result) );
		return result;
	}
	public static void main(String[] args) {
	//	question1
	//	int nums[] = {1,1,1,3,3,4,3,2,4,2};
	//	System.out.println(practice1(nums));
	
	// question2
//		int nums[] = {4,5,6,0,1,2};
//		int target = 0;
//		
//		int index = findkey(nums, target);
//		if (index == -1) {
//			System.out.println("it is not found");
//		}
//		else {
//			System.out.println("index = " + index);
//		}
		
	//	question3
//		int prices[] = {7,1,5,3,6,4};
//		System.out.println(findMaxProfit(prices));
		
	//	question4
//		int height[] = {4,2,0,3,2,5};
//		System.out.println(findtrappingWater(height));
		
	//	question5
		int nums[] = {-1,0,1,2,-1,-4};
		System.out.println(TripletSumEqualZero(nums));
	}
}
