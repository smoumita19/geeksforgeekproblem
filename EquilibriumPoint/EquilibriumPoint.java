class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {1,2,1,5,1,1,2,0,0};
        //int j =arr.length-1;


        if(arr.length == 1) {
            //return 1;
        }

        for(int i=0; i<arr.length;i++){
            int pos = i+1;
            int sumLeft = 0;
            int sumRight = 0;
            for(int j=0; j<pos;j++) {
                sumLeft += arr[j];
            }
            //System.out.println(sumLeft);


            for(int z=pos+1;z<arr.length;z++) {
                sumRight += arr[z];
            }
            //System.out.println(sumRight);
            if(sumLeft == sumRight) {
                System.out.println(pos+1);
                break;
                //return i+2;
            }
            //j--;

        }

        //return -1;

    }
}
