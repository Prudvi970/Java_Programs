class CountPositiveNegativeZero{
    public static void main(String[] args){
        int[] arr = {0,1,5,-3,4,0,-2};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i]>0){
                positive++;

            }else if(arr[i]<0){
                negative++;

            }else{
                zero++;
            }
        }
        System.out.println("positive:"+positive);
        System.out.println("negative:"+negative);
        System.out.println("zero:"+zero);
    }
}