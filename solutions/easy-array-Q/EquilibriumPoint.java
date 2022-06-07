QUES:   Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
  
  class Solution{
public static int equilibriumPoint(long arr[], int n) {
        int left = 0; 
        int sum = 0;
        
        for(int i=0; i<n; i++) {
            sum += arr[i]; 
        }
        for(int i=1; i<n; i++) {
            left += arr[i-1];
            if(sum-arr[i] == 2*left) { 
                return i+1;
            }
        }
        if(n == 1)
            return 1;
            
        return -1;
    }
}


OR

class Solution{
public static int equilibriumPoint(long arr[], int n) {
        
            long sum =0;
            long sumLeft=0;
       for(int i=0; i<n; i++){
           
           sum+=arr[i];
           
       }
       
       for(int i=0; i<n; i++){
           
           sumLeft = sumLeft + arr[i];
           
           if(sumLeft-arr[i]==sum-sumLeft) return i+1;
       }
       
       return -1;
   }
}
