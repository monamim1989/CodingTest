# CodingTest
Java Coding Test

# PROBLEM STATEMENT
BACKGROUND<br>
Sometimes items cannot be shipped to certain zip codes, and the rules for these restrictions are stored as a series of ranges of 5 digit codes. For example if the ranges are:
[94133,94133] [94200,94299] [94600,94699]
Then the item can be shipped to zip code 94199, 94300, and 65532, but cannot be shipped to 94133, 94650, 94230, 94600, or 94299.
Any item might be restricted based on multiple sets of these ranges obtained from multiple sources.
<br>
PROBLEM<br>
Given a collection of 5-digit ZIP code ranges (each range includes both their upper and lower bounds), provide an algorithm that produces the minimum number of ranges required to represent the same restrictions as the input.

# SOLUTION
I am using an input array of ranges (assuming lowerBound <= upperBound), checking the minimum number of ranges (using mergeRange method), and providing the output as an array of ranges as well. Initially, I sorted the array in increasing order of lower bounds. This helps is rearranging the input for further processing. I am using an ArrayList of integer array to add the output ranges in the program. The main method approach is to compare current range with previous range upper and lower bounds. There can be 3 different cases-<br>
 Previous range partially overlaps current range<br>
 OR,<br>
 Previous range contains current range<br>
 OR,<br>
 Previous range does not overlap current range<br>
 Based on these 3 cases, I have decided further steps. At the end, after iteration over all ranges is completed, I have converted ArrayList to int[][] array to return output.
 
 # TEST CASES
 I am also adding a separate file where I have mentioned some test cases covering regular and corner cases. Each test case has a relevant comment which mentions what type of case it is covering.

