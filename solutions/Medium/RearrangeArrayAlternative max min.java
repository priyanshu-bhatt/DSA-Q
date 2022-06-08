QUES : Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
Note: Modify the original array itself.


class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){   //Constant Space 
        long max=arr[n-1];
       long min=arr[0];
        for(int i =0;i<n;i++){
            if(i%2==0){
                arr[i]=max;
                max-=1;
            }
            else{
                arr[i]=min;
                min+=1;
            }
        }
    }
        // Your code here
}     


OR

class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        long temp[] = arr.clone();     //EXTRA SPACE O(N)
        long min = 0, long = n - 1;
        boolean counter = true;
 
        // Store result in temp[]
        for (int i = 0; i < n; i++) {
            if (counter)
                arr[i] = temp[max--];
            else
                arr[i] = temp[min++];
 
            counter = !counter;
        }
    }
        // Your code here
}       
