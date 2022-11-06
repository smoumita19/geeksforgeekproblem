import java.util.*;
class LeadersInAnArray {

    public static void main(String[] args) {

        int[] arr = {16,17,4,3,5,2};
        ArrayList<Integer> resArr = new ArrayList<Integer>();
        int res = -1;

        for(int i=0; i< arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if (arr[i] > arr[j] && (j == arr.length-1)) {
                    res = arr[i];
                    System.out.println(res);
                }

                if ((j == arr.length-1) && res > -1) {
                    resArr.add(arr[i]);
                }
            }
        }

        System.out.println(resArr);


    }

}
