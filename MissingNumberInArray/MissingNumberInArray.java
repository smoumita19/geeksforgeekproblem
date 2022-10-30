
class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum = 0;
        for(int i=0; i< n - 1; i++) {
            sum = sum + array[i];
        }
        
        return ((n*(n+1))/2 - sum) ;
        
    }
}
