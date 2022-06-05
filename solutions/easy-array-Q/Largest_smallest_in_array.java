Ques : #Amazon Given an array arr[] of size N of positive integers which may have duplicates. The task is to find the maximum and second maximum from the array, and both of them should be different from each other, so If no second max exists, then the second max will be -1.

class Solution{
// Solution class to implement function largestAndSecondLargest
public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
   {
       //code here.
       ArrayList<Integer> result_array = new ArrayList<Integer>();
       Arrays.sort(arr);
       int max=arr[0];
       int sec_max=-1;
       for(int i=1;i<sizeOfArray;i++){
           if(arr[i]>max){
           sec_max=max;
           max=arr[i];
           
       }
       else if(arr[i]<max && arr[i]>sec_max){
           sec_max=arr[i];
       }
       }
        result_array.add(max);
        result_array.add(sec_max);
        return result_array;
   }
} 
