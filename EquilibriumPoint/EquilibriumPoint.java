class Solution {

    int equilibriumPoint(long long a[], int n) {
    
        // Your code here
        long sum =0;
        
        for(int i=0; i<n;i++) {
            sum += a[i];
        }
        
        long sumleft= 0, sumright = sum - a[0];
        if(sumleft == sumright){
            return 1;
        }
        
        for(int i=1; i<n;i++) {
            sumleft = sumleft+a[i-1];
            sumright = sumright-a[i];
            if(sumleft==sumright) {
                return i+1;
            }
        }
        
        return -1;
    }

}
