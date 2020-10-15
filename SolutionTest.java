
public class SolutionTest {
	//Test case to check ranges with no overlap
	@Test
	public void mergeRangeTest1() throws Exception{
		int[] array1 = new int[] {94133,94133};
		int[] array2 = new int[] {94200,94299};
		int[] array3 = new int[] {94600,94699};
		int[][] input = new int[][] {array1,array2,array3};
		int[][] expectedResult = new int[][] {{94133,94133},{94200,94299},{94600,94699}};
		assertArrayEquals(expectedResult, Solution.mergeRange(input));
	}
	//Test case to check ranges with overlap
	@Test
	public void mergeRangeTest2() throws Exception{
		int[] array1 = new int[] {94133,94133};
		int[] array2 = new int[] {94200,94299};
		int[] array3 = new int[] {94226,94399};
		int[][] input = new int[][] {array1,array2,array3};
		int[][] expectedResult = new int[][] {{94133,94133},{94200,94399}};
		assertArrayEquals(expectedResult, Solution.mergeRange(input));
	}
	//Test case to check ranges with previous range upper bound equals next range lower bound
	@Test
	public void mergeRangeTest3() throws Exception{
		int[] array1 = new int[] {94133,94150};
		int[] array2 = new int[] {94150,94226};
		int[] array3 = new int[] {94226,94399};
		int[][] input = new int[][] {array1,array2,array3};
		int[][] expectedResult = new int[][] {{94133,94399}};
		assertArrayEquals(expectedResult, Solution.mergeRange(input));
	}
	//Test case to check ranges with decreasing overlap
	@Test
	public void mergeRangeTest4() throws Exception{
		int[] array1 = new int[] {94000,95562};
		int[] array2 = new int[] {94050,95514};
		int[] array3 = new int[] {94999,95000};
		int[][] input = new int[][] {array1,array2,array3};
		int[][] expectedResult = new int[][] {{94000,95562}};
		assertArrayEquals(expectedResult, Solution.mergeRange(input));
	}
	//Test case to check ranges with increasing overlap
	@Test
	public void mergeRangeTest5() throws Exception{
		int[] array1 = new int[] {67843,68999};
		int[] array2 = new int[] {67843,69000};
		int[] array3 = new int[] {67843,98324};
		int[][] input = new int[][] {array1,array2,array3};
		int[][] expectedResult = new int[][] {{67843,98324}};
		assertArrayEquals(expectedResult, Solution.mergeRange(input));
	}
	//Test case to check ranges in arbitary order
	@Test
	public void mergeRangeTest6() throws Exception{
		int[] array1 = new int[] {99999,99999};
		int[] array2 = new int[] {54567,69000};
		int[] array3 = new int[] {67698,73490};
		int[] array4 = new int[] {50000,54000};
		int[][] input = new int[][] {array1,array2,array3,array4};
		int[][] expectedResult = new int[][] {{50000,54000},{54567,73490},{99999,99999}};
		assertArrayEquals(expectedResult, Solution.mergeRange(input));
	}
}
