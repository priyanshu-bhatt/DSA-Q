QUES:
Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 
 

Example 1:

Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10

class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
        static long trappingWater(int arr[], int n) { 
        // Your code here
        int left = 0, right = n - 1;
        long left_max = Long.MIN_VALUE, right_max = Long.MIN_VALUE;  //Calculating min and max default values
        long water_traped = 0;
        
        while(left<right){ //till left pointer < right pointer
            left_max=Math.max(arr[left],left_max);    //left max calc
            right_max=Math.max(arr[right],right_max);   //right max calc
            if(left_max<right_max){    //if left max is less than the right i.e. we have to see the left side of the blocks tht can filll water
                water_traped=water_traped+(left_max-arr[left++]);      //trapedwater = traped_water + (max of left - current block)-> then post increment
            }
            else{
                water_traped=water_traped+(right_max-arr[right--]);  //if left max is not greater then ->
            }
            }
            return water_traped;
        }

    
}
