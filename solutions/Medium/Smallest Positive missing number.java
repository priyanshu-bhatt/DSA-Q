Ques : You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array.
  
  class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Arrays.sort(arr);
        int ans=1;;
        for(int i =0; i<size;i++){
            if(arr[i]==ans){
                ans++;
            }
        }
        return ans;
    }
}
