import java.util.*;

class FindDuplicatesInAnArray {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        int[] arr = {1,2,2,3,1};
        for(int i=0; i<arr.length;i++) {
            map.put(arr[i],0);
        }

        for(int i=0; i<arr.length;i++) {
            int c =0;
            if(map.containsKey(arr[i])) {
                c = map.get(arr[i]);

            }
            c = c+1;
            map.put(arr[i],c);
              
        }



        System.out.println(map);
        ArrayList<Integer> arrlist = new ArrayList<Integer>();

        for (Integer key : map.keySet()) {
            if(map.get(key) > 1) {
                arrlist.add(key);
            }
        }

        System.out.println(arrlist);
    }
}
