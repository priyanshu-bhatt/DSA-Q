Ques : Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int check=0;
        int nums=array.length;
        int sum=((nums+1)*(nums+2))/2;
        for(int i=0;i<nums;i++)
          sum-=array[i];
        return sum;
    }
    }
