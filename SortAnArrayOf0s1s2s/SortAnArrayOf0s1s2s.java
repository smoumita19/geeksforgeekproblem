class SortAnArrayOf0s1s2s {
    public static void main(String[] args) {
        sortArray();
    }

    public static void sortArray() {
        int[] arr = {0,0,2,2,2,1,0,1,1};
        int[] arr0 = new int[arr.length];
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];
        int[] arrAll = new int[arr.length];

        for(int i=0; i< arr.length ; i++) {
            if(arr[i] == 0) {
                arr0[i] = arr[i];
            }
        }

        for(int i=0; i< arr.length ; i++) {
            if(arr[i] == 1) {
                arr1[i] = arr[i];
            }
        }

        for(int i=0; i< arr.length ; i++) {
            if(arr[i] == 2) {
                arr2[i] = arr[i];
            }
        }

        for(int i=0; i< arr0.length; i ++) {
            if(i <  arr0.length) {
                arrAll[i] = arr0[i];
            }
        }

        for(int i=0; i< arr1.length; i ++) {
            if(i <  arr1.length) {
                arrAll[i] = arr1[i];
            }
        }

        for(int i=0; i< arr2.length; i ++) {
            if(i <  arr2.length) {
                arrAll[i] = arr2[i];
            }
        }

        for(int i=0; i< arr2.length;i++){
            System.out.println(arrAll[i]);
        }

    }
}
