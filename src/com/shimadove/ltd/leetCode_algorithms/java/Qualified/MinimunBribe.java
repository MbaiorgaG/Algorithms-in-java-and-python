package com.shimadove.ltd.leetCode_algorithms.java.Qualified;

public class MinimunBribe {

	public static void main(String[] args){
		int [] aaa = {2,1,5,3,4};
		System.out.println(minimumBribes(aaa));
	}
	public static String minimumBribes(int [] queue) {
		boolean chaotic = false;
		String returnValue = null;
		int bribes = 0;
		for (int i = 0; i < queue.length; i++) {
			if (queue[i] - (i+1) > 2) {
				chaotic = true;
			}
			for (int j = 0; j < i; j++) {
				if (queue[j] > queue[i]) {
					bribes++;
				}
			}
		}
		if(chaotic){
			return "Too chaotic";
		} else {
			return "3";
		}
	}

}
