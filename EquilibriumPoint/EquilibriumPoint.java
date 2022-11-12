class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {1,2,1,5,1,1,2,0,0};
        //int j =arr.length-1;


         long sum=0;

       for(int i=0;i<n;i++) {

            sum=sum+arr[i];

       }

       long left=0,right=sum-arr[0];

       if(left==right) return 1;

       for(int i=1;i<n;i++) {

       left=left+arr[i-1];

       right=right-arr[i];

       if(left==right) {

       return i+1;

       }





       }

       return -1;

        }

        //return -1;

    }
}
