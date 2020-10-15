import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static int[][] mergeRange(int[][] bounds){
		//Input is Empty!!
		if (bounds.length==0) {
			return new int[0][];
		}
		//Sorting input array by ascending lower bound
		Arrays.sort(bounds,(a,b)->a[0]-b[0]);
		
		List<int[]> list = new ArrayList<>(); //List to store output
		int[] prev = bounds[0]; //Previous range
		list.add(prev);
		
		for (int i = 1; i < bounds.length; i++) {
			int[] curr = bounds[i]; //Current range
			if (prev[1]>=curr[0] && prev[1]<=curr[1]) { //Partial overlap
				prev[1] = curr[1];
			}else if (prev[1]>=curr[1]) { //Previous contains current range
				continue;
			}else { //No overlap
				int[] newBound = new int[] {curr[0],curr[1]};
				list.add(newBound);
				prev = newBound;
			}
		}
		int[][] result = new int[list.size()][];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}
	public static void main(String[] args) {
		int[] array1 = new int[] {94133,94133};
		int[] array2 = new int[] {94200,94299};
		int[] array3 = new int[] {94600,94699};
		int[][] input = new int[][] {array1,array2,array3};
		int[][] result = mergeRange(input);
		System.out.println("Minimum number of ranges are :");
		for (int i = 0; i < result.length; i++) {
			System.out.println();
			System.out.print("["+result[i][0]+","+result[i][1]+"]");
		}
	}
}
