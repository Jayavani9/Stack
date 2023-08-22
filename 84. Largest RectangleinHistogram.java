84. Largest Rectangle in Histogram
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, 
return the area of the largest rectangle in the histogram.
  

Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.

Input: heights = [2,4]
Output: 4

Tc: O(n^2) ; Time Limit Exceeded Solution
if(heights == null || heights.length == 0) return 0;
        int area = 0;
        for(int i = 0;i < heights.length;i++)
        {
            int min = heights[i];
            for(int j = i; j < heights.length; j++)
            {

                min = Math.min(min, heights[j]);
                area = Math.max(area, min*(j-i+1));


            }
        }
        return area;
