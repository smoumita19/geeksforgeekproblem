class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            map.put(arr[i],0);
        }
        
        for(int i=0; i<n; i++) {
            int c = 0;
            if(map.containsKey(arr[i])) {
                c = map.get(arr[i]);
            }
            c= c+1;
            map.put(arr[i],c);
        }
        
        for(Integer key : map.keySet()) {
            if(map.get(key) > 1) {
                arrlist.add(key);
            }
        }
        
        if(arrlist.size() <=0 ) {
            arrlist.add(-1);
        } 
        Collections.sort(arrlist);  
        return arrlist;
        
    }
}
