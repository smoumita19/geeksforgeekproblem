//==================================== PROBLEM STATEMENT =================================

/*Q. Given an unsorted array A of size N that contains only non-negative integers,
find a continuous sub-array which adds to a given number S.
In case of multiple subarrays, return the subarray which comes first on moving from left to right.*/

//==================================== PROBLEM STATEMENT ENED ============================

import java.util.ArrayList;

class SubArrayWithGivenSum {
    public static void main(String[] args) {

        //Declaring the parameters
        int n = 5;
        int s = 12;
        int[] A = {1,2,3,7,5};

        //Calling the method
        subarraySum(A,n,s);

    }


    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum = arr[i];
            for(int j=i+1;j<n;j++) {
                sum += arr[j];

                if(sum == s && i<=j) {
                    arrlist.add(arr[i]);
                    arrlist.add(arr[j]);
                    return arrlist;
                    //System.out.print(arrlist);
                }
            }
        }

        arrlist.add(-1);
        return  arrlist;
    }
}


