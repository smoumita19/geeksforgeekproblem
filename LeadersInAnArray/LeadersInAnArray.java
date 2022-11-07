import java.util.*;
class LeadersInAnArray {

    public static void main(String[] args) {

        int[] arr = {16,17,4,3,5,2};
        ArrayList<Integer> resArr = new ArrayList<Integer>();
        int res = -1;
        int j = 0;
        for(int i=0; i< arr.length; i++) {
            j = i+1;
            while(j<arr.length){



                if(arr[i] > arr[j]) {
                    res = arr[i];
                    j++;


                }
                else {
                    break;
                }

                if(j == arr.length-1) {
                    System.out.println(res);
                    resArr.add(res);
                }

            }

            if(i == (arr.length-1)){
                resArr.add(arr[i]);
            }





        }

        System.out.println(resArr);

    }

}
