import java.util.*;
class LeadersInAnArray {

    public static void main(String[] args) {

        int[] arr = {16,17,4,3,5,2};
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int j = 0;
        int res = 0;
        for(int i=0; i<arr.length;i++) {
            j = i+1;
            if(i == (arr.length-1)){
                newArr.add(arr[i]);
            }
            while(j<arr.length) {
                if(arr[i] > arr[j]) {
                    res = arr[i];
                } else {
                    break;
                }
                
                if(j == (arr.length-1)) {
                    newArr.add(res);
                }
                j++;
                
            }
            
        }
        
        return newArr;

    }

}
