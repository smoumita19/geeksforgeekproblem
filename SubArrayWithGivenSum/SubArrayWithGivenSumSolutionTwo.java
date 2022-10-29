/////////////////////////////////// TIME AND SPACE COMPLEXITY ///////////////////////////////////
/* 
  Time Complexity: O(N), 
  Trying all subarrays from every index, used nested loop for the same
  Auxiliary Space: O(1). 
*/

/*
The idea is simple as we know that all the elements in subarray are positive so, 
If a subarray has sum greater than the given sum then there is no possibility that 
adding elements to the current subarray will be equal to the given sum. 
So the Idea is to use a similar approach to a sliding window. 

Step 1: Start with an empty subarray 
Step 2: Add elements to the subarray until the sum is less than x( given sum ). 
Step 3: If the sum is greater than x, remove elements from the start of the current subarray.
*/
/////////////////////////////////////////////////////////////////////////////////////////////////

class SubArrayWithGivenSumSolutionTwo
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

        ArrayList<Integer> arrli = new ArrayList<Integer>();
        int cursum = arr[0];
        int start = 0;
        for(int i=1; i<=n;i++) {

            while(cursum > s && start < i - 1) {
                cursum = cursum - arr[start];
                start++;
            }

            if(cursum == s) {
                arrli.add(start+1);
                arrli.add(i);
                return arrli;
            }

            if(i < n) {
                cursum = cursum + arr[i];
            }

        }

        if(arrli.size()==0) {
            arrli.add(-1);
        }

        return arrli;

    }
}
