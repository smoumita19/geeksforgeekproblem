class SortAnArrayOf0s1s2s {
    public static void main(String[] args) {
        sortArray();
    }

    public static void sort012(int a[], int n)
    {
        // code here 
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        int size =0;
        for(int i=0; i<n; i++) {
            if(a[i] == 0) {

                countZero++;
            }
        }


        for(int i=0; i<n; i++) {
            if(a[i] == 1) {
                countOne++;
            }
        }



        for(int i=0; i<n; i++) {
            if(a[i] == 2) {
                countTwo++;
            }
        }

        

        for(int i=0; i< countZero; i++){
            a[size] =0;
            size++;
        }

        for(int i=0; i< countOne; i++){
            a[size] =1;
            size++;
        }

        for(int i=0; i< countTwo; i++){
            a[size] =2;
            size++;
        }

      
        for(int i=0; i<n; i++) {
            System.out.print(a[i]);
        }
        
     
    }
}
