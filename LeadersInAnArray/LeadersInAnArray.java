class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int res = arr[arr.length-1];
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] >= res){
                res = arr[i];
                newArr.add(res);
            }
        }
        
        Collections.reverse(newArr);
        
        return newArr;
    }
}
