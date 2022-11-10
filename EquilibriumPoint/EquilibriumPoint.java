public static void main(String[] args) {
        int[] arr = {1,3,4,5,4,2,2};
        int j =arr.length-1;
        int sumFirst = 0;
        int sumLast = 0;

        if(arr.length == 1) {
            return 1;
        }

        for(int i=0; i<arr.length;i++){
            sumFirst += arr[i];
            sumLast += arr[j];
//            System.out.println(sumFirst);
//            System.out.println(sumLast);
//            System.out.println(i);

            if(sumFirst == sumLast) {
                System.out.println(i+2);
                break;
                return; i+2;
            }
            j--;

        }

        return -1;

    }
