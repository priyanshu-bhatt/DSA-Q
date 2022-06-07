class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int n, int p)
   {
       for(int i = 0 ; i < n ; i++)
           if((arr[i] - 1) % (p + 1) < n)
               arr[(arr[i] - 1) % (p + 1)] += (p + 1);
       for(int i = 0 ; i < n ; i++)
           arr[i] /= (p+1);
   }
    
}
