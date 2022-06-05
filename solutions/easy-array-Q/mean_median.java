Ques-Given an array a[ ] of size N. The task is to find the median and mean of the array elements. Mean is average of the numbers and median is the element which is smaller than half of the elements and greater than remaining half.  If there are odd elements, the median is simply the middle element in the sorted array. If there are even elements, then the median is floor of average of two middle numbers in the sorted array. If mean is floating point number, then we need to print floor of it.

//User function Template for Java

class Solution
{
  //Function to find median of the array elements.  
  public int median(int A[],int N)
    {
        int size=0;
      int result;
       Arrays.sort(A);
       if(N%2!=0){
           size=(N-1)/2;
           result=A[size];
       }
       else return (A[N/2]+A[(N/2)-1])/2;
       
       return result;
       //Your code here
       //If median is fraction then conver it to integer and return
    }
    //Function to find median of the array elements.
    public int mean(int A[],int N)
    {
       //Your code her
       int sum=0;
       int mean_result=0;
       for(int values : A){
           sum=sum+values;
           
       }
       return (mean_result=sum/N);
    }

}

