/////////////////////////////////// TIME AND SPACE COMPLEXITY ///////////////////////////////////
/* 
  Time Complexity: O(N2), 
  Trying all subarrays from every index, used nested loop for the same
  Auxiliary Space: O(1). 
*/
/////////////////////////////////////////////////////////////////////////////////////////////////


class SubArrayWithGivenSumSolutionOne
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum = arr[i];
            
            if( sum == s ) {
                arrlist.add(i+1);
                arrlist.add(i+1);
                return arrlist; 
            } else {
            
              for(int j=i+1;j<n;j++) {
                  sum += arr[j];

                  if(sum == s && i<=j) {
                      arrlist.add(i+1);
                      arrlist.add(j+1);
                      return arrlist;
                  }
              }
            
            }
        }

        arrlist.add(-1);
        return  arrlist;
    }
}


